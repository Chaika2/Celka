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
   public Object[] id_class;
   private static String[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;

   public String id_byte() {
      return (String)this.id_class[6];
   }

   public rrTo_1(rrtB_2 var1, String var2) {
      this.id_finally();
      ArrayDeque var7 = new ArrayDeque();
      this.id_class[2] = var7;
      this.id_class[id_throws[1]] = var1;
      this.id_class[1] = var2;
      String var10 = UUID.randomUUID().toString();
      this.id_class[6] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public rrtP_2 id_class() {
      return (rrtP_2)rrtP_2.staticFields2f7653125b2938db917a91704c972442[id_throws[10]];
   }

   @Override
   public void id_class(rrTi_1 var1, boolean var2) {
      throw new UnsupportedOperationException(id_break[0]);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, -46, 115, 117, 78, 59, -1, 71}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7300498549594261612L;
   }

   public void id_class(int var1) {
      Thread var6 = new Thread(() -> {
         NioEventLoopGroup var9 = new NioEventLoopGroup();
         this.id_class[3] = var9;

         try {
            Bootstrap var2 = new Bootstrap();
            ((Bootstrap)((Bootstrap)var2.group((EventLoopGroup)this.id_class[3])).channel(NioSocketChannel.class)).handler(new rrTK(this, var1));
            ChannelFuture var3 = var2.connect((String)this.id_class[1], var1).sync();
            Channel var10 = var3.channel();
            this.id_class[5] = var10;
            var3.channel().closeFuture().sync();
         } catch (Exception var13) {
            var13.printStackTrace();
         } finally {
            ((EventLoopGroup)this.id_class[3]).shutdownGracefully();
         }
      });
      this.id_class[4] = var6;
      ((Thread)this.id_class[4]).start();
   }

   @Override
   public void id_class(rrTi_1 var1, Channel var2, boolean var3) {
      if (this.id_break()) {
         try {
            this.id_case().id_class(var1, var2, var3);
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 596545602;
   }

   @Override
   public void id_break(rrTi_1 var1, boolean var2) {
      this.id_class(var1, (Channel)this.id_class[5], var2);
   }

   public boolean id_break() {
      Channel var1 = this.id_throws();
      return var1 != null && var1.isActive() ? true : id_protected[1];
   }

   public Channel id_throws() {
      return (Channel)this.id_class[5];
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[7];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_throws = new short[]{2, 0, 1, 6, 4, 4, 5, 4, 4, 5, 0, 0, 5, 6, 3, 3, 1, 5, 3, 3, 3};
   }

   private static void id_extends() {
      id_protected = new boolean[]{true, false};
   }

   @Override
   public rrtB_2 id_case() {
      return (rrtB_2)this.id_class[id_throws[11]];
   }

   private static void id_implements() {
      id_byte = new byte[]{7};
   }

   public void id_protected() {
      try {
         if (this.id_break()) {
            ((Channel)this.id_class[5]).close();
         }

         if ((Thread)this.id_class[4] != null) {
            ((Thread)this.id_class[4]).join();
         }
      } catch (InterruptedException var2) {
         Thread.currentThread().interrupt();
      }
   }

   private static void id_private() {
      id_break = new String[]{new String("Cannot send packet to all from client.")};
   }
}
