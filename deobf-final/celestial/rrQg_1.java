package celestial;

import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.net.Proxy;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQg_1 implements MinecraftAccessor {
   private static long[] break_;
   private static short[] byte_;
   public static Object[] class_;
   private static boolean[] protected_;
   private static String[] throws_;
   private static byte[] case_;

   public static YggdrasilUserAuthentication byte_() {
      return (YggdrasilUserAuthentication)class_[1];
   }

   private rrQg_1() {
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1190362939;
   }

   public static void class_(rqN_2 var0) {
      import_.class_(var0);
      rrQR var5 = (rrQR)rrQR.staticFields390584fa19b23798828925cb0991ad90[3];
      class_[5] = var5;
      Long var6 = 0L;
      class_[4] = var6;
      ((Logger)QY.break_[1]).info("Minecraft session for {} (uuid={}) has been applied", var0.byte_(), var0.class_());
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{57, 21, -48, -68, 41, -128, -106, -67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2228158760300063219L;
   }

   public static YggdrasilMinecraftSessionService class_() {
      return (YggdrasilMinecraftSessionService)import_.r();
   }

   public static CompletableFuture<rrQR> break_() {
      return System.currentTimeMillis() - class_[4] < 60000L ? CompletableFuture.completedFuture((rrQR)class_[5]) : CompletableFuture.supplyAsync(() -> {
         rqN_2 var0 = protected_();
         String var1 = UUID.randomUUID().toString();
         YggdrasilMinecraftSessionService var2 = class_();

         try {
            ((Logger)QY.break_[byte_[7]]).info(throws_[2]);
            var2.joinServer(var0.throws_(), var0.protected_(), var1);
            if (var2.hasJoinedServer(var0.throws_(), var1, null) != null) {
               ((Logger)QY.break_[byte_[8]]).info(throws_[3]);
               rrQR var8 = (rrQR)rrQR.staticFields390584fa19b23798828925cb0991ad90[byte_[9]];
               class_[byte_[10]] = var8;
            } else {
               ((Logger)QY.break_[byte_[11]]).warn(throws_[4]);
               rrQR var9 = (rrQR)rrQR.staticFields390584fa19b23798828925cb0991ad90[byte_[12]];
               class_[byte_[13]] = var9;
            }
         } catch (AuthenticationException var12) {
            ((Logger)QY.break_[1]).error("Could not validate the Minecraft session!", var12);
            rrQR var10 = (rrQR)rrQR.staticFields390584fa19b23798828925cb0991ad90[2];
            class_[5] = var10;
         }

         Long var11 = System.currentTimeMillis();
         class_[4] = var11;
         return (rrQR)class_[5];
      });
   }

   public static rqN_2 break_(String var0) {
      return new rqN_2(
         var0, UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes(StandardCharsets.UTF_8)).toString(), "invalidtoken", rqc_3.LEGACY.class_()
      );
   }

   private static void throws_() {
      throws_ = new String[]{
         new String("Minecraft session for {} (uuid={}) has been applied"),
         new String("invalidtoken"),
         new String("Verifying Minecraft session..."),
         new String("The Minecraft session is valid"),
         new String("The Minecraft session is invalid!"),
         new String("Could not validate the Minecraft session!"),
         new String("invalidtoken")
      };
   }

   private static void finally_() {
      Object[] var0 = new Object[6];
      var0[0] = new YggdrasilAuthenticationService(Proxy.NO_PROXY, "486b7f3f-e308-4f61-b625-cd66747d35ef");
      var0[1] = ((YggdrasilAuthenticationService)var0[0]).createUserAuthentication(null);
      var0[2] = "invalidtoken";
      var0[3] = 60000L;
      var0[4] = 0L;
      var0[5] = new rrQR();
      class_ = var0;
   }

   private static void catch_() {
      break_ = new long[]{0L, 60000L, 60000L, 0L};
   }

   private static void extends_() {
      protected_ = new boolean[]{false, false, true};
   }

   private static void implements_() {
      case_ = new byte[]{3, 5, 6, 2, 3, 4};
   }

   public static rqN_2 protected_() {
      return QY.instanceof_().while_();
   }

   private static void private_() {
      byte_ = new short[]{3, 5, 4, 1, 4, 5, 1, 1, 1, 0, 5, 1, 1, 5, 1, 2, 5, 4, 5};
   }
}
