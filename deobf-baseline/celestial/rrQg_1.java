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
   private static long[] id_break;
   private static short[] id_byte;
   public static Object[] id_class;
   private static boolean[] id_protected;
   private static String[] id_throws;
   private static byte[] id_case;

   public static YggdrasilUserAuthentication id_byte() {
      return (YggdrasilUserAuthentication)id_class[id_byte[6]];
   }

   private rrQg_1() {
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1190362939;
   }

   public static void id_class(rqN_2 var0) {
      id_import.id_class(var0);
      rrQR var5 = (rrQR)rrQR.staticFields390584fa19b23798828925cb0991ad90[id_byte[0]];
      id_class[id_byte[1]] = var5;
      Long var6 = id_break[0];
      id_class[id_byte[2]] = var6;
      ((Logger)QY.id_break[id_byte[3]]).info(id_throws[0], var0.id_byte(), var0.id_class());
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{57, 21, -48, -68, 41, -128, -106, -67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2228158760300063219L;
   }

   public static YggdrasilMinecraftSessionService id_class() {
      return (YggdrasilMinecraftSessionService)id_import.r();
   }

   public static CompletableFuture<rrQR> id_break() {
      return System.currentTimeMillis() - id_class[id_byte[4]] < id_break[1]
         ? CompletableFuture.completedFuture((rrQR)id_class[id_byte[5]])
         : CompletableFuture.supplyAsync(() -> {
            rqN_2 var0 = id_protected();
            String var1 = UUID.randomUUID().toString();
            YggdrasilMinecraftSessionService var2 = id_class();

            try {
               ((Logger)QY.id_break[id_byte[7]]).info(id_throws[2]);
               var2.joinServer(var0.id_throws(), var0.id_protected(), var1);
               if (var2.hasJoinedServer(var0.id_throws(), var1, null) != null) {
                  ((Logger)QY.id_break[id_byte[8]]).info(id_throws[3]);
                  rrQR var8 = (rrQR)rrQR.staticFields390584fa19b23798828925cb0991ad90[id_byte[9]];
                  id_class[id_byte[10]] = var8;
               } else {
                  ((Logger)QY.id_break[id_byte[11]]).warn(id_throws[4]);
                  rrQR var9 = (rrQR)rrQR.staticFields390584fa19b23798828925cb0991ad90[id_byte[12]];
                  id_class[id_byte[13]] = var9;
               }
            } catch (AuthenticationException var12) {
               ((Logger)QY.id_break[id_byte[14]]).error(id_throws[5], var12);
               rrQR var10 = (rrQR)rrQR.staticFields390584fa19b23798828925cb0991ad90[id_byte[15]];
               id_class[id_byte[16]] = var10;
            }

            Long var11 = System.currentTimeMillis();
            id_class[id_byte[17]] = var11;
            return (rrQR)id_class[id_byte[18]];
         });
   }

   public static rqN_2 id_break(String var0) {
      return new rqN_2(
         var0, UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes(StandardCharsets.UTF_8)).toString(), id_throws[1], rqc_3.LEGACY.id_class()
      );
   }

   private static void id_throws() {
      id_throws = new String[]{
         new String("Minecraft session for {} (uuid={}) has been applied"),
         new String("invalidtoken"),
         new String("Verifying Minecraft session..."),
         new String("The Minecraft session is valid"),
         new String("The Minecraft session is invalid!"),
         new String("Could not validate the Minecraft session!"),
         new String("invalidtoken")
      };
   }

   private static void id_finally() {
      Object[] var0 = new Object[6];
      var0[0] = new YggdrasilAuthenticationService(Proxy.NO_PROXY, "486b7f3f-e308-4f61-b625-cd66747d35ef");
      var0[1] = ((YggdrasilAuthenticationService)var0[0]).createUserAuthentication(null);
      var0[2] = id_throws[6];
      var0[3] = 60000L;
      var0[4] = 0L;
      var0[5] = new rrQR();
      id_class = var0;
   }

   private static void id_catch() {
      id_break = new long[]{0L, 60000L, 60000L, 0L};
   }

   private static void id_extends() {
      id_protected = new boolean[]{false, false, true};
   }

   private static void id_implements() {
      id_case = new byte[]{3, 5, 6, 2, 3, 4};
   }

   public static rqN_2 id_protected() {
      return QY.id_instanceof().id_while();
   }

   private static void id_private() {
      id_byte = new short[]{3, 5, 4, 1, 4, 5, 1, 1, 1, 0, 5, 1, 1, 5, 1, 2, 5, 4, 5};
   }
}
