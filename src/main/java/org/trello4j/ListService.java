package org.trello4j;

import org.trello4j.model.Action;
import org.trello4j.model.Board;
import org.trello4j.model.Card;
import org.trello4j.model.List;

import java.util.Map;

/**
 * The Interface ListService.
 * 
 * @author joel
 */
public interface ListService {

	/**
	 * Gets the list.
	 * 
	 * @param listId
	 *            the list id
	 * @return the list
	 */
	List getList(String listId);

	/**
	 * Gets the actions by list.
	 * 
	 * @param listId
	 *            the list id
	 * @return the actions by list
	 */
	java.util.List<Action> getActionsByList(String listId);

	/**
	 * Gets the board by list.
	 * 
	 * @param listId
	 *            the list id
	 * @return the board by list
	 */
	Board getBoardByList(String listId, String... filter);

	/**
	 * Gets the cards by list.
	 * 
	 * @param listId
	 *            the list id
	 * @return the cards by list
	 */
	java.util.List<Card> getCardsByList(String listId, String... filter);

	/**
	 * Add a new {@link List} with the optional keyValue pairs.
	 * @param idBoard Id of the {@link org.trello4j.model.Board}
	 *               the list should be added to.
	 * @param name Name of the new list.
	 * @param keyValeMap Map of the optional key-value-pairs.
	 */
	List createList(String idBoard, String name, Map<String, String> keyValueMap);

}