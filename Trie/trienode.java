package Trie;
import java.util.HashMap;
import java.util.Map;

public class trienode {
    Map <Character,trienode> children;
    boolean EndofString;

    public trienode() {
        children =new HashMap<>();
        EndofString=false;
    }
}
 