package celestial;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Av_1 {
   static final Splitter class_ = Splitter.on('\u0000').limit(6);
   static final Logger break_ = LogManager.getLogger();
   private final List<rud_3> byte_ = Collections.synchronizedList(Lists.newArrayList());

   static rgP_2 class_(int var0, int var1) {
      return new rgN_2(Integer.toString(var0)).class_(new rgN_2("/").class_(rgF_2.DARK_GRAY)).break_(Integer.toString(var1)).class_(rgF_2.GRAY);
   }

   public void class_() {
      synchronized (this.byte_) {
         Iterator var2 = this.byte_.iterator();

         while (var2.hasNext()) {
            rud_3 var3 = (rud_3)var2.next();
            if (var3.case_()) {
               var3.class_();
            } else {
               var2.remove();
               var3.native_();
            }
         }
      }
   }

   public void class_(Ak_1 var1, Runnable var2) throws UnknownHostException {
      Ad_1 var3 = Ad_1.class_(var1.break_);
      rud_3 var4 = rud_3.class_(InetAddress.getByName(var3.class_()), var3.break_(), false);
      this.byte_.add(var4);
      var1.protected_ = new rgn_3("multiplayer.status.pinging");
      var1.throws_ = -1L;
      var1.implements_ = null;
      var4.class_(new AF(this, var4, var1, var2));

      try {
         var4.class_(new rmJ_2(var3.class_(), var3.break_(), ruv_3.STATUS));
         var4.class_(new rLS());
      } catch (Throwable var6) {
         break_.error(var6);
      }
   }

   void class_(Ak_1 var1) {
      Ad_1 var2 = Ad_1.class_(var1.break_);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)rud_3.protected_.class_())).handler(new AL(this, var2, var1)))
            .channel(NioSocketChannel.class))
         .connect(var2.class_(), var2.break_());
   }

   public void break_() {
      synchronized (this.byte_) {
         Iterator var2 = this.byte_.iterator();

         while (var2.hasNext()) {
            rud_3 var3 = (rud_3)var2.next();
            if (var3.case_()) {
               var2.remove();
               var3.class_(new rgn_3("multiplayer.status.cancelled"));
            }
         }
      }
   }
}
