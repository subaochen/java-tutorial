package cn.edu.sdut.softlab.mina;

import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import java.util.Date;

/**
 * Created by subaochen on 17-2-18.
 */
public class TimeServerHandler extends IoHandlerAdapter {
    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
        cause.printStackTrace();
    }

    /**
     * 当客户端收到服务器的消息后触发此方法.
     * @param session IoSession对象
     * @param message 客户端收到消息对象
     * @throws Exception
     */
    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        String str = message.toString();
        if (str.trim().equalsIgnoreCase("quit")) {
            session.close();
            return;
        }
        Date date = new Date();
        // 无论客户端发来什么消息，服务器只是把当前日期发送回去
        session.write(date.toString());
        System.out.println("Message written...");
    }
}
