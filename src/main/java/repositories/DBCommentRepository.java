package repositories;

import model.Comment;
import utility.InOut;

public class DBCommentRepository implements CommentRepository {

	@Override
	public void storeComment(Comment comment) {
		InOut.console.println("comment is being stored : " + comment.getText());
	}

}
