package leetcode.tree.binary.resursion;

import java.util.List;

/**
 * Created by zhaiyi on 2018/10/2.
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}