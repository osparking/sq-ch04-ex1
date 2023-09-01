package repositories;

import org.springframework.stereotype.Component;

import model.Comment;
import utility.InOut;

@Component
public class DBCommentRepository implements CommentRepository {

	@Override
	public void storeComment(Comment comment) {
		InOut.console.println("comment is being stored : " + comment.getText());
	}

}
