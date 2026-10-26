package celestial;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTo_1 implements rrtr_3 {
   public Object[] class_;
   private static String[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;

   public String byte_() {
      return (String)this.class_[6];
   }

   public rrTo_1(rrtB_2 var1, String var2) {
      this.finally_();
      ArrayDeque var7 = new ArrayDeque();
      this.class_[2] = var7;
      this.class_[0] = var1;
      this.class_[1] = var2;
      String var10 = UUID.randomUUID().toString();
      this.class_[6] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public rrtP_2 class_() {
      return (rrtP_2)rrtP_2.staticFields2f7653125b2938db917a91704c972442[0];
   }

   @Override
   public void class_(rrTi_1 var1, boolean var2) {
      throw new UnsupportedOperationException("Cannot send packet to all from client.");
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, -46, 115, 117, 78, 59, -1, 71}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7300498549594261612L;
   }

   public void class_(int var1) {
      Thread var6 = new Thread(() -> {
         NioEventLoopGroup var9 = new NioEventLoopGroup();
         this.class_[3] = var9;

         try {
            Bootstrap var2 = new Bootstrap();
            ((Bootstrap)((Bootstrap)var2.group((EventLoopGroup)this.class_[throws_[15]])).channel(NioSocketChannel.class)).handler(new rrTK(this, var1));
            ChannelFuture var3 = var2.connect((String)this.class_[throws_[16]], var1).sync();
            Channel var10 = var3.channel();
            this.class_[throws_[17]] = var10;
            var3.channel().closeFuture().sync();
         } catch (Exception var13) {
            var13.printStackTrace();
         } finally {
            ((EventLoopGroup)this.class_[3]).shutdownGracefully();
         }
      });
      this.class_[4] = var6;
      ((Thread)this.class_[4]).start();
   }

   @Override
   public void class_(rrTi_1 var1, Channel var2, boolean var3) {
      if (this.break_()) {
         try {
            this.case_().class_(var1, var2, var3);
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 596545602;
   }

   @Override
   public void break_(rrTi_1 var1, boolean var2) {
      this.class_(var1, (Channel)this.class_[5], var2);
   }

   public boolean break_() {
      Channel var1 = this.throws_();
      return var1 != null && var1.isActive() ? true : protected_[1];
   }

   public Channel throws_() {
      return (Channel)this.class_[5];
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[7];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      throws_ = new short[]{2, 0, 1, 6, 4, 4, 5, 4, 4, 5, 0, 0, 5, 6, 3, 3, 1, 5, 3, 3, 3};
   }

   private static void extends_() {
      protected_ = new boolean[]{true, false};
   }

   @Override
   public rrtB_2 case_() {
      return (rrtB_2)this.class_[0];
   }

   private static void implements_() {
      byte_ = new byte[]{7};
   }

   public void protected_() {
      try {
         if (this.break_()) {
            ((Channel)this.class_[throws_[6]]).close();
         }

         if ((Thread)this.class_[throws_[7]] != null) {
            ((Thread)this.class_[throws_[8]]).join();
         }
      } catch (InterruptedException var2) {
         Thread.currentThread().interrupt();
      }
   }

   private static void private_() {
      break_ = new String[]{new String("Cannot send packet to all from client.")};
   }
}
