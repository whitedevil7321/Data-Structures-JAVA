class Graph:
    def __init__(self,directed=False):
        self.directed=False
        self.adj_list=list()

    def __repr__(self):
        graph_str = ""
        for node , neighbour  in self.adj_list:
            graph_str += f"{node} -> {neighbour}\n"
        return graph_str

    def add_node(self,node):

        if node not in self.adj_list:
            self.adj_list[node]=set()
        else: 
            raise ValueError(f"Node {node} already exists in the graph.")    

    def remove_node(self,node):
        if node not in self.adj_list:
            raise ValueError(f"Node {node} does not exist in the graph.")
        for neighbour in self.adj_list.values():
            neighbour.discard(node)
        del self.adj_list[node]

    def add_edge(self,from_node,to_node,weight=None):

        if from_node not in self.adj_list:
            self.add_node(from_node)
        if to_node not in self.adj_list:
            self.add_node(to_node)
        if weight is None:
            self.adj_list[from_node].add(to_node)
            if not self.directed:
                self.adj_list[to_node].add(from_node) 
        if weight is not None:
            self.adj_list[from_node].add((to_node,weight))
            if not self.directed:
                self.adj_list[to_node].add((from_node,weight))         

        

    def remove_edge(self,from_node,to_node):
        if self.adj_list[from_node] is None:
            raise ValueError(f"Node {from_node} does not exist in the graph.")
        if from_node in self.adj_list:
            if to_node in self.adj_list[from_node]:
                self.adj_list[from_node].remove(to_node) 
            else:
                raise ValueError(f"Edge from {from_node} to {to_node} does not exist.")   
            if not self.directed:
                if from_node in self.adj_list[to_node]:
                    self.adj_list[to_node].remove(from_node) 
                 
            

    def get_neighbours(self,node):
        return self.adj_list.get(node, set())

    def has_node(self,node):
        return node in self.adj_list
    
    def has_edge(self,from_node,to_node):
        if from_node in self.adj_list:
            return to_node in self.adj_list[from_node]
        return False
    
    def get_nodes(self):
        return list(self.adj_list.keys())
    
    def get_edges(self,from_node,to_node):
        edges = []
        for from_node, neighbours in self.adj_list.items():
            for to_node in neighbours:
                edges.append((from_node, to_node))


    def bfs(self,start):
        visited=set()
        queue=[start]
        order=[]
        while queue:
            node=queue.pop(0)
            if node not in visited:
                visited.add(node)
                order.append(node)
                neighbours=self.get_neighbours(node)
                for neighbour in neighbours:
                    if isinstance(neighbour, tuple):
                        neighbour=neighbour[0]
                    if neighbour not in visited:
                        queue.append(neighbour) 
        return order                





    def dfs(self,start):
        visited=set()
        stack=[start]
        order=[]
        while stack:
            node=stack.pop()
            if node not in visited:
                visited.add(node)
                order.append(node)
                neighbours=self.get_neighbours(node)
                for neighbour in sorted(neighbours,reverse=True): 
                    # Sort neighbours in reverse order for consistent DFS traversal                    
                    if isinstance(neighbour, tuple):
                        neighbour=neighbour[0]
                    if neighbour not in visited:
                        stack.append(neighbour) 
        return order 

