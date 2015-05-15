package ttc.gravity.convert;

import java.util.HashSet;
import java.util.Hashtable;

import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.members.Method;
import org.emftext.language.java.types.Type;

class TreeNode {
	String key;
	
	Type type;
	
	TreeNode parent;
	Hashtable<String, TreeNode> child;
	
	HashSet<Method> methods;
	
	TreeNode(Type type, TreeNode parent){
		
		child = new Hashtable<String, TreeNode>();
		methods = new HashSet<Method>();
		
		this.type = type;

		if(type instanceof ConcreteClassifier){
			key = ((ConcreteClassifier) type).getContainingCompilationUnit().getName();
			key = key.substring(0, key.length()-5);
		}
		else if(type instanceof Type){
			String name = type.getClass().getName();
			key = type.getClass().getName().substring(37, name.length()-4);
		}
		else if(type == null){
			key = null;
		}
		else{
			throw new RuntimeException();
		}
		
		this.parent = parent;
		if(parent!=null){
			parent.addChild(this);
		}
	}

	private void addChild(TreeNode treeNode) {
		child.put(treeNode.key, treeNode);
	}
	
	@Override
	public String toString(){
		return parent + " -> "+key;
	}
	
}