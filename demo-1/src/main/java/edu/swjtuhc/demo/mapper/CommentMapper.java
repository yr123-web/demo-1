package edu.swjtuhc.demo.mapper;

import java.util.List;

import javax.xml.stream.events.Comment;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CommentMapper {
	
	public List<Comment> selectAllComment();

}
