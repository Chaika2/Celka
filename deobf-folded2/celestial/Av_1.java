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
   static final Splitter id_class = Splitter.on('\u0000').limit(6);
   static final Logger id_break = LogManager.getLogger();
   private final List<rud_3> id_byte = Collections.synchronizedList(Lists.newArrayList());

   static rgP_2 id_class(int var0, int var1) {
      return new rgN_2(Integer.toString(var0)).id_class(new rgN_2("/").id_class(rgF_2.DARK_GRAY)).id_break(Integer.toString(var1)).id_class(rgF_2.GRAY);
   }

   public void id_class() {
      synchronized (this.id_byte) {
         Iterator var2 = this.id_byte.iterator();

         while (var2.hasNext()) {
            rud_3 var3 = (rud_3)var2.next();
            if (var3.id_case()) {
               var3.id_class();
            } else {
               var2.remove();
               var3.id_native();
            }
         }
      }
   }

   public void id_class(Ak_1 var1, Runnable var2) throws UnknownHostException {
      Ad_1 var3 = Ad_1.id_class(var1.id_break);
      rud_3 var4 = rud_3.id_class(InetAddress.getByName(var3.id_class()), var3.id_break(), false);
      this.id_byte.add(var4);
      var1.id_protected = new rgn_3("multiplayer.status.pinging");
      var1.id_throws = -1L;
      var1.id_implements = null;
      var4.id_class(new AF(this, var4, var1, var2));

      try {
         var4.id_class(new rmJ_2(var3.id_class(), var3.id_break(), ruv_3.STATUS));
         var4.id_class(new rLS());
      } catch (Throwable var6) {
         id_break.error(var6);
      }
   }

   void id_class(Ak_1 var1) {
      Ad_1 var2 = Ad_1.id_class(var1.id_break);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)rud_3.id_protected.id_class())).handler(new AL(this, var2, var1)))
            .channel(NioSocketChannel.class))
         .connect(var2.id_class(), var2.id_break());
   }

   public void id_break() {
      synchronized (this.id_byte) {
         Iterator var2 = this.id_byte.iterator();

         while (var2.hasNext()) {
            rud_3 var3 = (rud_3)var2.next();
            if (var3.id_case()) {
               var2.remove();
               var3.id_class(new rgn_3("multiplayer.status.cancelled"));
            }
         }
      }
   }
}
