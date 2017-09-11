package me.ujung.projectm.dao;

import java.util.List;

import me.ujung.projectm.model.Message;

/**
 * @author sukmin.kwon
 * @since 2017-09-11
 */
public interface MessageDao {

	List<Message> selectMessages();

}
