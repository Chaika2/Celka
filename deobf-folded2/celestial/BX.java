package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BX extends Pv_1 implements PP {
   private static String[] id_case;
   private static short[] id_catch;
   private static boolean[] id_private;
   private static byte[] id_implements;
   public Object[] id_break;
   public static Object[] id_throws;

   public void id_byte() {
      this.id_private();
      String var5 = "";
      this.id_break[0] = var5;
      String var6 = "";
      this.id_break[1] = var6;
      String var7 = "";
      this.id_break[2] = var7;
      String var8 = "";
      this.id_break[3] = var8;
   }

   public BX(C_class var1) {
      super(var1);
      this.id_private();
      String var6 = "";
      this.id_break[0] = var6;
      String var7 = "";
      this.id_break[1] = var7;
      String var8 = "";
      this.id_break[2] = var8;
      String var9 = "";
      this.id_break[3] = var9;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8127409132820148154L;
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_private();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) {
            return;
         }

         this.id_byte();

         try {
            for (rnP_2 var3 : ((gm_3)b_.id_class[id_catch[7]]).id_package().id_class()) {
               String var4 = var3.id_protected().id_byte().trim().toLowerCase();
               if (var4.equals(id_case[4])) {
                  String var9 = id_case[5];
                  this.id_break[id_catch[8]] = var9;
               } else if (((Pattern)id_throws[id_catch[9]]).matcher(var4).find()) {
                  String var10 = var4.substring(var4.indexOf(id_case[6]) + id_private[0]).trim();
                  this.id_break[id_catch[10]] = var10;
               }
            }

            for (String var17 : ((cq_3)b_.id_class[id_catch[11]]).id_new()) {
               String var18 = var17.toLowerCase();
               if (((Pattern)id_throws[id_catch[12]]).matcher(var18).find()) {
                  String var11 = var17.replaceAll(id_case[7], id_case[8]).trim();
                  this.id_break[id_catch[13]] = var11;
               } else if (((Pattern)id_throws[id_catch[14]]).matcher(var18).find()) {
                  String var12 = var17.replaceAll(id_case[9], id_case[10]).trim();
                  this.id_break[id_catch[15]] = var12;
               } else if (((Pattern)id_throws[id_catch[16]]).matcher(var18).find()) {
                  String var13 = var17.substring(var17.indexOf(id_case[11]) + id_private[1]).trim();
                  this.id_break[id_catch[17]] = var13;
               } else if (((Pattern)id_throws[id_catch[18]]).matcher(var18).find()) {
                  String var14 = var17.substring(var17.indexOf(id_case[12]) + id_private[2]).trim();
                  this.id_break[id_catch[19]] = var14;
               }
            }
         } catch (Exception var15) {
         }
      }
   }

   public String id_class() {
      this.id_private();
      return (String)this.id_break[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 460671955;
   }

   @Override
   public void id_class(rrFK var1) {
      this.id_byte();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-97, -9, 102, -12, 23, 69, 44, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_break() {
      this.id_private();
      return (String)this.id_break[3];
   }

   public String id_throws() {
      this.id_private();
      return (String)this.id_break[0];
   }

   private static void id_finally() {
      id_case = new String[]{
         new String(""),
         new String(""),
         new String(""),
         new String(""),
         new String("гриф #mega"),
         new String("mega"),
         new String("#"),
         new String("[^0-9]"),
         new String(""),
         new String("[^0-9]"),
         new String(""),
         new String("-"),
         new String(":"),
         new String(""),
         new String(""),
         new String(""),
         new String(""),
         new String("гриф #\\d+"),
         new String("сервер: \\W+"),
         new String("баланс: \\$\\d+"),
         new String("рилликов: \\d+"),
         new String("клан: .+")
      };
   }

   private static void id_catch() {
      id_implements = new byte[]{2, 3, 4, 4, 5};
   }

   private static void id_extends() {
      Object[] var0 = new Object[]{
         Pattern.compile("гриф #\\d+", 0),
         Pattern.compile("сервер: \\W+"),
         Pattern.compile("баланс: \\$\\d+"),
         Pattern.compile("рилликов: \\d+"),
         Pattern.compile("клан: .+")
      };
      id_throws = var0;
   }

   private static void id_case() {
      id_catch = new short[]{0, 1, 2, 3, 0, 1, 0, 56, 0, 0, 0, 19, 2, 1, 3, 2, 1, 0, 4, 3, 0, 1, 2, 3, 0, 1, 2, 3};
   }

   private static void id_implements() {
      id_private = new boolean[]{true, true, true, false, true};
   }

   public String id_protected() {
      this.id_private();
      return (String)this.id_break[2];
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
         Object[] var1 = this.id_break;
      }
   }
}
