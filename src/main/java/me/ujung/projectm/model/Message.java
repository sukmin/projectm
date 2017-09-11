package me.ujung.projectm.model;

/**
 *
 create table projectm_msg (id bigint not null auto_increment primary key, msg varchar(100));
 insert into projectm_msg(msg) values ("one");
 insert into projectm_msg(msg) values ("two");
 insert into projectm_msg(msg) values ("three");
 *
 * @author sukmin.kwon
 * @since 2017-09-11
 */
public class Message {

	private Long id;
	private String message;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
