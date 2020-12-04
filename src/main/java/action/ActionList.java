package action;

public interface ActionList<E> extends Action{
	/**
	 * Title of the list of actions (menu).
	 *
	 * @return the title of the action list
	 */
	public String Title();

	/**
	 * The number of actions in the action list.
	 *
	 * @return number of actions in the action list.
	 */
	public int listsize();

	/**
	 * Add an action at the end of the list action if it does not yet exists.
	 *
	 * @param ac the action to add
	 * @return true if action is added, else false
	 */
	public boolean addAction(Action<E> ac);
	
	public boolean removeAction(Action<E> ac);
	
	public boolean getAction(int index);
}

