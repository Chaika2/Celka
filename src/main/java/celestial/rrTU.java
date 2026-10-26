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
   public Object[] id_class;
   private static String[] id_break;
   private static short[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_throws;

   public void id_byte() {
      if ((EventLoopGroup)this.id_class[id_byte[5]] != null) {
         ((EventLoopGroup)this.id_class[id_byte[6]]).shutdownGracefully();
      }

      if ((EventLoopGroup)this.id_class[id_byte[7]] != null) {
         ((EventLoopGroup)this.id_class[id_byte[8]]).shutdownGracefully();
      }

      if ((Thread)this.id_class[id_byte[9]] != null) {
         ((Thread)this.id_class[id_byte[10]]).interrupt();
      }
   }

   public rrTU(rrtB_2 var1, String var2) {
      this.id_throws();
      CopyOnWriteArrayList var7 = Lists.newCopyOnWriteArrayList();
      this.id_class[id_byte[0]] = var7;
      this.id_class[id_byte[1]] = var1;
      this.id_class[id_byte[2]] = var2;
   }

   static {
      ntfClinit();
   }

   public void id_class(rrTi_1 var1, Channel var2, boolean var3) {
      try {
         this.id_case().id_class(var1, var2, var3);
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public void id_class(int var1) {
      Thread var6 = new Thread(
         () -> {
            NioEventLoopGroup var10 = new NioEventLoopGroup();
            this.id_class[id_byte[18]] = var10;
            NioEventLoopGroup var11 = new NioEventLoopGroup();
            this.id_class[id_byte[19]] = var11;
            boolean var17 = false /* VF: Semaphore variable */;

            label64: {
               try {
                  var17 = true;
                  ServerBootstrap var2 = new ServerBootstrap();
                  ((ServerBootstrap)((ServerBootstrap)var2.group((EventLoopGroup)this.id_class[id_byte[20]], (EventLoopGroup)this.id_class[id_byte[21]])
                           .channel(NioServerSocketChannel.class))
                        .childHandler(new rrTe_1(this))
                        .option(ChannelOption.SO_BACKLOG, Integer.valueOf(id_byte[22])))
                     .childOption(ChannelOption.SO_KEEPALIVE, id_throws[0]);
                  ChannelFuture var3 = var2.bind((String)this.id_class[id_byte[23]], var1).sync();
                  var3.channel().closeFuture().sync();
                  var17 = false;
                  break label64;
               } catch (Exception var21) {
                  var21.printStackTrace();
                  var17 = false;
               } finally {
                  if (var17) {
                     try {
                        ((EventLoopGroup)this.id_class[id_byte[28]]).shutdownGracefully().sync();
                        ((EventLoopGroup)this.id_class[id_byte[29]]).shutdownGracefully().sync();
                     } catch (InterruptedException var18) {
                        Thread.currentThread().interrupt();
                     }
                  }
               }

               try {
                  ((EventLoopGroup)this.id_class[id_byte[26]]).shutdownGracefully().sync();
                  ((EventLoopGroup)this.id_class[id_byte[27]]).shutdownGracefully().sync();
               } catch (InterruptedException var19) {
                  Thread.currentThread().interrupt();
               }

               return;
            }

            try {
               ((EventLoopGroup)this.id_class[id_byte[24]]).shutdownGracefully().sync();
               ((EventLoopGroup)this.id_class[id_byte[25]]).shutdownGracefully().sync();
            } catch (InterruptedException var20) {
               Thread.currentThread().interrupt();
            }
         }
      );
      this.id_class[id_byte[3]] = var6;
      ((Thread)this.id_class[id_byte[4]]).start();
   }

   public rrtP_2 id_class() {
      return (rrtP_2)rrtP_2.staticFields2f7653125b2938db917a91704c972442[id_byte[14]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{45, 77, 89, -102, -92, 96, -23, -19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public List<rrTY> id_class(Predicate<rrTY> var1, Comparator<rrTY> var2) {
      ArrayList var3 = new ArrayList();

      for (rrTY var5 : (List)this.id_class[id_byte[12]]) {
         if (var1 == null || var1.test(var5)) {
            var3.add(var5);
         }
      }

      if (var2 != null) {
         var3.sort(var2);
      }

      return var3;
   }

   public void id_class(rrTY var1) {
      ((List)this.id_class[id_byte[16]]).add(var1);
      id_import.execute(() -> rrfu_3.id_byte("Новое подключение: " + var1.id_protected().channel().remoteAddress()));
   }

   public void id_class(rrTi_1 var1, boolean var2) {
      for (rrTY var4 : (List)this.id_class[id_byte[11]]) {
         this.id_class(var1, var4.id_protected().channel(), var2);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4432040601275877639L;
   }

   public List<rrTY> id_class(Predicate<rrTY> var1) {
      return this.id_class(var1, null);
   }

   public void id_break(rrTi_1 var1, boolean var2) {
      throw new UnsupportedOperationException(id_break[0]);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -782328787;
   }

   public void id_break(rrTY var1) {
      ((List)this.id_class[id_byte[17]]).remove(var1);
      id_import.execute(() -> rrfu_3.id_byte("Отключение: " + var1.id_protected().channel().remoteAddress()));
   }

   public List<rrTY> id_break() {
      return (List<rrTY>)this.id_class[id_byte[13]];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_protected = new byte[]{6};
   }

   public rrtB_2 id_case() {
      return (rrtB_2)this.id_class[id_byte[15]];
   }

   private static void id_implements() {
      id_throws = new boolean[]{true};
   }

   private static void id_protected() {
      id_byte = new short[]{5, 0, 1, 2, 2, 4, 4, 3, 3, 2, 2, 5, 5, 5, 1, 0, 5, 5, 3, 4, 3, 4, 128, 1, 4, 3, 4, 3, 4, 3};
   }

   private static void id_private() {
      id_break = new String[]{new String("Cannot send packet without channel.")};
   }
}
