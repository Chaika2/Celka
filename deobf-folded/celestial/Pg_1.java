package celestial;

import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pg_1 extends Pv_1 implements PP {
   private static byte[] id_case;
   private static boolean[] id_catch;
   public Object[] id_break;
   public static Object[] id_throws;
   private static short[] id_private;
   private static String[] id_implements;

   private static void id_byte() {
      id_implements = new String[]{new String("")};
   }

   public Pg_1(C_class var1) {
      super(var1);
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 810729399;
   }

   @Override
   public void id_class(j_1 var1) {
      this.id_throws();
      if (var1.id_class() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[id_private[0]]
         && (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6]) {
         this.id_class();

         try {
            rgP_2 var2 = ((cq_3)b_.id_class[19]).id_implements().id_protected();
            if (var2 != null) {
               String var3 = var2.id_byte();
               if (!rql_3.id_break(var3)) {
                  Po_1 var4 = id_private(var3);
                  if (var4 != null) {
                     this.id_break[id_private[4]] = var4;
                  }
               }
            }
         } catch (Exception var10) {
         }
      }
   }

   @Override
   public void id_class(rrFK var1) {
      this.id_class();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5696618919883330150L;
   }

   public void id_class() {
      this.id_throws();
      Object var5 = null;
      this.id_break[id_private[5]] = var5;
   }

   public Po_1 id_break() {
      this.id_throws();
      return (Po_1)this.id_break[id_private[8]];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{112, -85, 12, -71, 84, 84, -84, 115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_catch() {
      id_case = new byte[]{2};
   }

   private static void id_case() {
      id_catch = new boolean[]{true, false, true, true};
   }

   private static void id_protected() {
      id_private = new short[]{0, 1, 6, 19, 0, 0, 0, 0, 0};
   }

   public static Po_1 id_private(String var0) {
      if (rql_3.id_break(var0)) {
         return null;
      } else {
         for (PK var2 : ((EnumMap)id_throws[id_private[6]]).keySet()) {
            Matcher var3 = ((Pattern)((EnumMap)id_throws[id_private[7]]).get(var2)).matcher(var0);
            if (var3.find()) {
               String var4 = var3.group(1);
               return new Po_1(var2, var4 != null ? var4 : id_implements[0]);
            }
         }

         return null;
      }
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new PR(PK.class), new PY()};
      id_throws = var0;
   }
}
