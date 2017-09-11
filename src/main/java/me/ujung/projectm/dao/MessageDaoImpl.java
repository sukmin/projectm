package me.ujung.projectm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.ujung.projectm.model.Message;

/**
 * @author sukmin.kwon
 * @since 2017-09-11
 */
@Repository
public class MessageDaoImpl implements MessageDao {

	private static final String NAMESPACE = "me.ujung.projectm.dao.MessageDao";

	private SqlSession sqlSession;

	@Autowired
	public MessageDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Message> selectMessages() {
		return sqlSession.selectList(NAMESPACE + ".selectMessages");
	}
}
