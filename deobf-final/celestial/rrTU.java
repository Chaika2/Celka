package celestial;

import com.google.common.collect.Lists;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTU implements MinecraftAccessor, rrtr_3 {
   public Object[] class_;
   private static String[] break_;
   private static short[] byte_;
   private static byte[] protected_;
   private static boolean[] throws_;

   public void byte_() {
      if ((EventLoopGroup)this.class_[4] != null) {
         ((EventLoopGroup)this.class_[4]).shutdownGracefully();
      }

      if ((EventLoopGroup)this.class_[3] != null) {
         ((EventLoopGroup)this.class_[3]).shutdownGracefully();
      }

      if ((Thread)this.class_[2] != null) {
         ((Thread)this.class_[2]).interrupt();
      }
   }

   public rrTU(rrtB_2 var1, String var2) {
      this.throws_();
      CopyOnWriteArrayList var7 = Lists.newCopyOnWriteArrayList();
      this.class_[5] = var7;
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrTi_1 var1, Channel var2, boolean var3) {
      try {
         this.case_().class_(var1, var2, var3);
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public void class_(int var1) {
      Thread var6 = new Thread(
         () -> {
            NioEventLoopGroup var10 = new NioEventLoopGroup();
            this.class_[3] = var10;
            NioEventLoopGroup var11 = new NioEventLoopGroup();
            this.class_[4] = var11;
            boolean var17 = false /* VF: Semaphore variable */;

            label64: {
               try {
                  var17 = true;
                  ServerBootstrap var2 = new ServerBootstrap();
                  ((ServerBootstrap)((ServerBootstrap)var2.group((EventLoopGroup)this.class_[byte_[20]], (EventLoopGroup)this.class_[byte_[21]])
                           .channel(NioServerSocketChannel.class))
                        .childHandler(new rrTe_1(this))
                        .option(ChannelOption.SO_BACKLOG, Integer.valueOf(byte_[22])))
                     .childOption(ChannelOption.SO_KEEPALIVE, throws_[0]);
                  ChannelFuture var3 = var2.bind((String)this.class_[byte_[23]], var1).sync();
                  var3.channel().closeFuture().sync();
                  var17 = false;
                  break label64;
               } catch (Exception var21) {
                  var21.printStackTrace();
                  var17 = false;
               } finally {
                  if (var17) {
                     try {
                        ((EventLoopGroup)this.class_[byte_[28]]).shutdownGracefully().sync();
                        ((EventLoopGroup)this.class_[byte_[29]]).shutdownGracefully().sync();
                     } catch (InterruptedException var18) {
                        Thread.currentThread().interrupt();
                     }
                  }
               }

               try {
                  ((EventLoopGroup)this.class_[byte_[26]]).shutdownGracefully().sync();
                  ((EventLoopGroup)this.class_[byte_[27]]).shutdownGracefully().sync();
               } catch (InterruptedException var19) {
                  Thread.currentThread().interrupt();
               }

               return;
            }

            try {
               ((EventLoopGroup)this.class_[byte_[24]]).shutdownGracefully().sync();
               ((EventLoopGroup)this.class_[byte_[25]]).shutdownGracefully().sync();
            } catch (InterruptedException var20) {
               Thread.currentThread().interrupt();
            }
         }
      );
      this.class_[2] = var6;
      ((Thread)this.class_[2]).start();
   }

   @Override
   public rrtP_2 class_() {
      return (rrtP_2)rrtP_2.staticFields2f7653125b2938db917a91704c972442[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{45, 77, 89, -102, -92, 96, -23, -19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public List<rrTY> class_(Predicate<rrTY> var1, Comparator<rrTY> var2) {
      ArrayList var3 = new ArrayList();

      for (rrTY var5 : (List)this.class_[5]) {
         if (var1 == null || var1.test(var5)) {
            var3.add(var5);
         }
      }

      if (var2 != null) {
         var3.sort(var2);
      }

      return var3;
   }

   public void class_(rrTY var1) {
      ((List)this.class_[5]).add(var1);
      import_.execute(() -> rrfu_3.byte_("Новое подключение: " + var1.protected_().channel().remoteAddress()));
   }

   @Override
   public void class_(rrTi_1 var1, boolean var2) {
      for (rrTY var4 : (List)this.class_[5]) {
         this.class_(var1, var4.protected_().channel(), var2);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4432040601275877639L;
   }

   public List<rrTY> class_(Predicate<rrTY> var1) {
      return this.class_(var1, null);
   }

   @Override
   public void break_(rrTi_1 var1, boolean var2) {
      throw new UnsupportedOperationException("Cannot send packet without channel.");
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -782328787;
   }

   public void break_(rrTY var1) {
      ((List)this.class_[5]).remove(var1);
      import_.execute(() -> rrfu_3.byte_("Отключение: " + var1.protected_().channel().remoteAddress()));
   }

   public List<rrTY> break_() {
      return (List<rrTY>)this.class_[5];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      protected_ = new byte[]{6};
   }

   @Override
   public rrtB_2 case_() {
      return (rrtB_2)this.class_[0];
   }

   private static void implements_() {
      throws_ = new boolean[]{true};
   }

   private static void protected_() {
      byte_ = new short[]{5, 0, 1, 2, 2, 4, 4, 3, 3, 2, 2, 5, 5, 5, 1, 0, 5, 5, 3, 4, 3, 4, 128, 1, 4, 3, 4, 3, 4, 3};
   }

   private static void private_() {
      break_ = new String[]{new String("Cannot send packet without channel.")};
   }
}
