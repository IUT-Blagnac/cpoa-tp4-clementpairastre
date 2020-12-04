package action;

import banque.AgenceBancaire;

public interface ActionContext<E> {
	public E getContext();
}
