package edu.swjtuhc.demo.service;

import java.io.InputStream;
import java.util.List;

import edu.swjtuhc.demo.model.Comment;



public interface CommentService {
	
public List<Comment> getCommentList();
	
	public int createComment(Comment Comment, InputStream fileStream);


}
