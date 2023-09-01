package proxies;

import org.springframework.stereotype.Component;

import model.Comment;
import utility.InOut;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		InOut.console.println("Comment being notified by email: " + comment.getText());
	}

}
