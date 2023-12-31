package services;

import org.springframework.stereotype.Component;

import model.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Component
public class CommentService {
	private CommentRepository commentRepository;
	private CommentNotificationProxy commentNotificationProxy;

	public CommentService(CommentRepository commentRepository,
			CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}
	
	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);		
	}
}
