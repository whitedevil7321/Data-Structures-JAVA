class Graph:
    def __init__(self, edges):
        self.edges = edges
        self.graph = {}
        for start, end in self.edges:
            if start in self.graph:
                self.graph[start].append(end)
            else:
                self.graph[start] = [end]
        print(f"The dictionary representation of the graph is:\n{self.graph}")

    def get_paths(self, start, end, path=[]):
        path = path + [start]

        if start == end:
            return [path]

        if start not in self.graph:
            return []

        paths = []
        for node in self.graph[start]:
            if node not in path:
                new_paths = self.get_paths(node, end, path)
                for p in new_paths:
                    paths.append(p)

        return paths
    

    def get_shortest_path(self,start,end,path=[]):
        path = path + [start]

        if start==end:
            return path
        if start not in self.graph:
            return None
        shortest_path=None
        for node in self.graph[start]:
            if node not in path:
                sp = self.get_shortest_path(node,end,path)
                if sp:
                    if shortest_path is None or len(sp)<len(shortest_path):
                        shortest_path=sp
        return shortest_path
        




if __name__ == "__main__":
    d = [
        ("Nashik", "Mumbai"),
        ("Mumbai", "Pune"),
        ("Pune", "Nashik"),
        ("Nashik", "Delhi"),
        ("Delhi", "Mumbai"),
        ("Delhi", "Pune"),
        ("Delhi", "Nashik")
    ]
    g = Graph(d)
    start = "Nashik"
    end = "Pune"
    paths = g.get_paths(start, end)
    print(f"All paths from {start} to {end} are:")
    for path in paths:
        print(" -> ".join(path))
   
    print("shortest path is:",g.get_shortest_path(start,end,))    
