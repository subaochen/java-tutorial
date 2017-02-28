package cn.edu.sdut.softlab.mina;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;

/**
 * Created by subaochen on 17-2-18.
 */
public class MinaTimeServer {
    private static final int PORT = 9123;

    public static void main(String[] args) throws IOException {
        // 创建服务器端的监听器对象
        IoAcceptor acceptor = new NioSocketAcceptor();
        // 增加日志过滤器：用于日志存储
        acceptor.getFilterChain().addLast("logger", new LoggingFilter());
        // 增加消息编码过滤器，采用UTF-8编码
        acceptor.getFilterChain().addLast("codec",
                new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("UTF-8"))));
        // 设置具体的事物逻辑处理器
        acceptor.setHandler(new TimeServerHandler());
        // 设置IoSession的一些属性
        acceptor.getSessionConfig().setReadBufferSize(2048);
        acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, 10);
        // 设置服务器监听的端口
        acceptor.bind(new InetSocketAddress(PORT));
    }
}
