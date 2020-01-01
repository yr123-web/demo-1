package edu.swjtuhc.demo.serviceimpl;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.CommentMapper;
import edu.swjtuhc.demo.model.Comment;
import edu.swjtuhc.demo.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	CommentMapper CommentMapper;

	@Override
	public List<Comment> getCommentList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createComment(Comment Comment, InputStream fileStream) {
		// TODO Auto-generated method stub
		return 0;
	}

}
