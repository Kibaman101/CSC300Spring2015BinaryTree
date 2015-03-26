
public class BinaryTree 
{
	private Node root;
	
	public BinaryTree()
	{
		this.root = null;
	}
	
	
	
	public void displayInOrder()
	{
		System.out.println("**** In Order ****");
		if(this.root == null)
		{
			System.out.println("Empty Tree");
		}
		else
		{
			this.root.visitInOrder();
		}
		System.out.println("");
	}
	
	public void displayPostOrder()
	{
		System.out.println("**** Post Order ****");
		
		if(this.root == null)
		{
			System.out.println("Empty Tree");
		}
		else
		{
			if(this.root.getLeftNode() != null)
			{
				if(this.root.getLeftNode().getLeftNode() != null)
				{
					if(this.root.getLeftNode().getLeftNode().getLeftNode() != null)
					{
						System.out.print(this.root.getLeftNode());
					}
				}
				System.out.print(this.root.getLeftNode().getPayload() + " ");
			}
		}
	}
	
	public void add(int value)
	{
		Node theNode = new Node(value);
		if(this.root == null)
		{
			this.root = theNode;
		}
		else
		{
			this.root.addNode(theNode);
		}
		
	}
}
