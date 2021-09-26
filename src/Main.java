package net.typingsites;


import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.entities.RichPresence;
import com.jagrosh.discordipc.exceptions.NoDiscordClientException;
import java.awt.Desktop;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Scanner;
import javax.servlet.Servlet;
import net.stream.Stream;
import net.typingsites.servlet.PostTask;
import net.typingsites.enumeratewindows.EnumerateWindows;
import org.eclipse.jetty.server.ConnectionFactory;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.HttpConfiguration;
import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Main {
  private static boolean first;

  private static IPCClient ipcClient;
  
  private static RichPresence.Builder builder;
    
  private static long setClientID = 1;

  private static long UpdateClientID = 1;

  private static Thread thread;
  private static Thread getactivewindow;
  public static void main(String[] paramArrayOfString) {

        EnumerateWindows window_title = new EnumerateWindows();
                Thread getactivewindow = new Thread(() -> {
while (true) {
        try {
          Thread.sleep(5000L);
        } catch (Exception exception) {
          System.out.println("Errer");
        }
                try {
          window_title.getwindow();
        } catch (Exception e){
          System.out.println("Errer");
        }
}
    });
    getactivewindow.start();

    new Stream();
    (new Main()).run();

  }
  
    public void run() {


    ServletContextHandler servletHandler = new ServletContextHandler(1);
    servletHandler.setMaxFormContentSize(16384);
    servletHandler.addServlet(new ServletHolder((Servlet)new PostTask(this)), "/post");
    HandlerList handlerList = new HandlerList();
    handlerList.addHandler((Handler)servletHandler);
    Server server = new Server();
    server.setHandler((Handler)handlerList);
    HttpConfiguration httpConfiguration = new HttpConfiguration();
    httpConfiguration.setSendServerVersion(false);
    HttpConnectionFactory httpConnectionFactory = new HttpConnectionFactory(httpConfiguration);
    ServerConnector serverConnector = new ServerConnector(server, new ConnectionFactory[] { (ConnectionFactory)httpConnectionFactory });
    serverConnector.setPort(8843);
    server.setConnectors(new Connector[] { (Connector)serverConnector });
    try {
      server.start();
      server.join();
    } catch (Exception e) {
      e.printStackTrace();
    } 
    
  }
  
  public void connect(String paramDetail, String paramState, String paramLargeImage, String paramUrl) {
      System.out.println("--------------------------------------------------------------");
      System.out.println("Initializing connection... "+paramUrl);
if(paramUrl.equals("close") && this.first){
  System.out.println("RPC Close!!");
  this.ipcClient.close();
  this.first = false;
  return;
}else if(paramUrl.equals("https://www.e-typing.ne.jp")) {
  this.UpdateClientID = 881946862435852320L;
}else if(paramUrl.equals("https://typing-tube.net")){
  this.UpdateClientID = 675987298642558988L;
}else if(paramUrl.equals("type.cgi")){
  this.UpdateClientID = 883702983462887425L;
}else if(paramUrl.equals("https://typing.tanonews.com")){
  this.UpdateClientID = 883758857321599068L;
}else if(paramUrl.equals("https://typing.twi1.me")){
  this.UpdateClientID = 883854572748161094L;
}else if(paramUrl.equals("https://typingerz.com")){
  this.UpdateClientID = 883853560234774570L;
}else if(paramUrl.equals("https://music-typing.net")){
  this.UpdateClientID = 883903825319182376L;
}else if(paramUrl.equals("http://typingx0.net/sushida/play")){
  this.UpdateClientID = 883858241870770246L;
}else if(paramUrl.equals("http://typingx0.net/pop")){
  this.UpdateClientID = 883881408244903989L;
}else if(paramUrl.equals("https://typing.playgram.jp")){
  this.UpdateClientID = 883883546681421824L;
}else if(paramUrl.equals("http://typingwar.trap.games")){
  this.UpdateClientID = 883851107619733545L;
}else if(paramUrl.equals("https://zty.pe")){
  this.UpdateClientID = 883890071021977611L;
}else if(paramUrl.equals("https://mcz-release.com/live/play")){
  this.UpdateClientID = 883891085158547518L;
}else if(paramUrl.equals("https://pokedebi.com/game/momotype/")){
  this.UpdateClientID = 883902214760988735L;
}else if(paramUrl.equals("typingclub.com")){
  this.UpdateClientID = 883902725581049867L;
}else if(paramUrl.equals("typing.io")){
  this.UpdateClientID = 883905545994637382L;
}else if(paramUrl.equals("https://10fastfingers.com")){
  this.UpdateClientID = 883887413800362015L;
}else if(paramUrl.equals("shakyo.io")){
  this.UpdateClientID = 883906577965400084L;
}else if(paramUrl.equals("https://www.intersteno.org/intersteno-internet-contests")){
  this.UpdateClientID = 884464432317603850L;
}else if(paramUrl.equals("https://www.typrx.com")){
  this.UpdateClientID = 883907693134356501L;
}else if(paramUrl.equals("http://hakatashi.github.io/YouTyping")){
  this.UpdateClientID = 883902438325764117L;
}else if(paramUrl.equals("http://typingx0.net/map")){
  this.UpdateClientID = 883900383469109288L;
}else if(paramUrl.equals("http://typingx0.net/easy")){
  this.UpdateClientID = 883900163947642901L;
}else if(paramUrl.equals("https://lyrics-typing.com")){
  this.UpdateClientID = 883894450806460447L;
}else if(paramUrl.equals("https://1st.natorisana.love/game/zuho_cpp")){
  this.UpdateClientID = 883898599287709717L;
}else if(paramUrl.equals("https://game.nicovideo.jp/atsumaru/games/gm15182")){
  this.UpdateClientID = 883898751167631360L;
}else if(paramUrl.equals("https://sorauchi.com/unity")){
  this.UpdateClientID = 883898922752430091L;
}else if(paramUrl.equals("https://typoly.idolypride.jp/game")){
  this.UpdateClientID = 883899047130308648L;
}else if(paramUrl.equals("http://typingx0.net/map_c")){
  this.UpdateClientID = 883900225801048104L;
}else if(paramUrl.equals("https://manabi-gakushu.benesse.ne.jp/gakushu/typing/nihongonyuryoku.html")){
  this.UpdateClientID = 883899931532869632L;
}else if(paramUrl.equals("http://gontyping.com/typing-game/practice")){
  this.UpdateClientID = 883899324474462249L;
}else if(paramUrl.equals("http://typingx0.net/az")){
  this.UpdateClientID = 883900475613773844L;
}else if(paramUrl.equals("http://typingx0.net/osakana")){
  this.UpdateClientID = 884465474136592445L;
}else if(paramUrl.equals("https://typewell-in-browser.web.app")){
  this.UpdateClientID = 884468630505545729L;
}else if(paramUrl.equals("http://sintyaku.pa.land.to/daken2/tajitaji.htm")){
  this.UpdateClientID = 884468895388414002L;
}else if(paramUrl.equals("http://sintyaku.pa.land.to/daken2/tajisakumagosou.htm")){
  this.UpdateClientID = 884469156748099605L;
}else if(paramUrl.equals("https://secure.pasoken.net/maipaso/app")){
  this.UpdateClientID = 884470930246631424L;
}else if(paramUrl.equals("https://typing-training.net")){
  this.UpdateClientID = 884471586864902234L;
}else if(paramUrl.equals("https://www.ntv.co.jp/haken2020/special")){
  this.UpdateClientID = 884474132425752607L;
}else if(paramUrl.equals("gontyping.com")){
  this.UpdateClientID = 883899324474462249L;
}else if(paramUrl.equals("speedcoder.net")){
  this.UpdateClientID = 886265631958270012L;
}else if(paramUrl.equals("タイプウェル国語Ｒ")){
  this.UpdateClientID = 889055974332174366L;
}else if(paramUrl.equals("タイプウェル憲法")){
  this.UpdateClientID = 889144726954082384L;
}else if(paramUrl.equals("タイプウェル国語Ｋ")){
  this.UpdateClientID = 889145758752841769L;
}else if(paramUrl.equals("タイプウェルオリジナル")){
  this.UpdateClientID = 889146327420764191L;
}else if(paramUrl.equals("タイプウェルＦＴ")){
  this.UpdateClientID = 889147082299019385L;
}else if(paramUrl.equals("Weather Typing")){
  this.UpdateClientID = 889122451550793731L;
}else if(paramUrl.equals("ニコ生タイピング")){
  this.UpdateClientID = 889126522114408479L;
}else if(paramUrl.equals("TypeLighter")){
  this.UpdateClientID = 889120435319488562L;
}else if(paramUrl.equals("limitkpm")){
  this.UpdateClientID = 889140631614656552L;
}else if(paramUrl.equals("IshoTyping")){
  this.UpdateClientID = 889126742193758278L;
}else if(paramUrl.equals("歌謡タイピング劇場")){
  this.UpdateClientID = 889078132433379390L;
}else if(paramUrl.equals("美佳のタイプトレーナー")){
  this.UpdateClientID = 889172133048090684L;
}else if(paramUrl.equals("The Typing of the Dead")){
  this.UpdateClientID = 889167712847274005L;
}else if(paramUrl.equals("Ozawa-Ken")){
  this.UpdateClientID = 889175028598439947L;
}
    if(this.setClientID != 1 && this.setClientID != this.UpdateClientID){
      this.ipcClient.close();
      this.first = false;
      System.out.println("ResetID");
    }

    if (!this.first) {
      this.setClientID = this.UpdateClientID;
      this.ipcClient = new IPCClient(this.UpdateClientID);
      System.out.println("SetID");
      try {
        this.ipcClient.connect(new com.jagrosh.discordipc.entities.DiscordBuild[0]);
      } catch (NoDiscordClientException e) {
        System.out.println("Access it with Discord running.");
        return;
      } 
      System.out.println("new RichPresence");
      this.builder = new RichPresence.Builder();
      System.out.println("created RichPresence");
      this.builder.setStartTimestamp(OffsetDateTime.now());
      this.first = true;
    } 
      System.out.println("Set Rich Presence informations.");
      this.builder.setLargeImage(paramLargeImage);
      if(paramDetail.equals("undefined")){
        this.builder.setDetails(null).setState(null);
      }else{  
        this.builder.setDetails(paramDetail);
        if(!paramState.equals("undefined")){
	        this.builder.setState(paramState); 
        }else{
          this.builder.setState(null); 
        }
      }
    System.out.println("Sending Rich Presence information.");
    this.ipcClient.sendRichPresence(this.builder.build());
    System.out.println("Sended Rich Presence infomation!");
    System.out.println("--------------------------------------------------------------");
		if(this.thread != null){
			thread.interrupt();
			}
      this.thread = new Thread(() -> {
        try {
          System.out.println("Close RPC after 60 seconds...");
          Thread.sleep(60000L);
        } catch (Exception exception) {
        System.out.println("Cancel after 60 Close");
				return;
        }
          this.ipcClient.close();
					this.setClientID = 1;
					this.first = false;
          System.out.println("Close RPC!");

      });
      thread.start();
  }
}