package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BX extends Pv_1 implements PP {
   private static String[] case_;
   private static short[] catch_;
   private static boolean[] private_;
   private static byte[] implements_;
   public Object[] break_;
   public static Object[] throws_;

   public void byte_() {
      this.private_();
      String var5 = "";
      this.break_[0] = var5;
      String var6 = "";
      this.break_[1] = var6;
      String var7 = "";
      this.break_[2] = var7;
      String var8 = "";
      this.break_[3] = var8;
   }

   public BX(C_class var1) {
      super(var1);
      this.private_();
      String var6 = "";
      this.break_[0] = var6;
      String var7 = "";
      this.break_[1] = var7;
      String var8 = "";
      this.break_[2] = var8;
      String var9 = "";
      this.break_[3] = var9;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8127409132820148154L;
   }

   @Override
   public void class_(q_1 var1) {
      this.private_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) {
            return;
         }

         this.byte_();

         try {
            for (rnP_2 var3 : ((gm_3)b_.class_[catch_[7]]).package_().class_()) {
               String var4 = var3.protected_().byte_().trim().toLowerCase();
               if (var4.equals(case_[4])) {
                  String var9 = case_[5];
                  this.break_[catch_[8]] = var9;
               } else if (((Pattern)throws_[catch_[9]]).matcher(var4).find()) {
                  String var10 = var4.substring(var4.indexOf(case_[6]) + private_[0]).trim();
                  this.break_[catch_[10]] = var10;
               }
            }

            for (String var17 : ((cq_3)b_.class_[catch_[11]]).new_()) {
               String var18 = var17.toLowerCase();
               if (((Pattern)throws_[catch_[12]]).matcher(var18).find()) {
                  String var11 = var17.replaceAll(case_[7], case_[8]).trim();
                  this.break_[catch_[13]] = var11;
               } else if (((Pattern)throws_[catch_[14]]).matcher(var18).find()) {
                  String var12 = var17.replaceAll(case_[9], case_[10]).trim();
                  this.break_[catch_[15]] = var12;
               } else if (((Pattern)throws_[catch_[16]]).matcher(var18).find()) {
                  String var13 = var17.substring(var17.indexOf(case_[11]) + private_[1]).trim();
                  this.break_[catch_[17]] = var13;
               } else if (((Pattern)throws_[catch_[18]]).matcher(var18).find()) {
                  String var14 = var17.substring(var17.indexOf(case_[12]) + private_[2]).trim();
                  this.break_[catch_[19]] = var14;
               }
            }
         } catch (Exception var15) {
         }
      }
   }

   public String class_() {
      this.private_();
      return (String)this.break_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 460671955;
   }

   @Override
   public void class_(rrFK var1) {
      this.byte_();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-97, -9, 102, -12, 23, 69, 44, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String break_() {
      this.private_();
      return (String)this.break_[3];
   }

   public String throws_() {
      this.private_();
      return (String)this.break_[0];
   }

   private static void finally_() {
      case_ = new String[]{
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

   private static void catch_() {
      implements_ = new byte[]{2, 3, 4, 4, 5};
   }

   private static void extends_() {
      Object[] var0 = new Object[]{
         Pattern.compile("гриф #\\d+", 0),
         Pattern.compile("сервер: \\W+"),
         Pattern.compile("баланс: \\$\\d+"),
         Pattern.compile("рилликов: \\d+"),
         Pattern.compile("клан: .+")
      };
      throws_ = var0;
   }

   private static void case_() {
      catch_ = new short[]{0, 1, 2, 3, 0, 1, 0, 56, 0, 0, 0, 19, 2, 1, 3, 2, 1, 0, 4, 3, 0, 1, 2, 3, 0, 1, 2, 3};
   }

   private static void implements_() {
      private_ = new boolean[]{true, true, true, false, true};
   }

   public String protected_() {
      this.private_();
      return (String)this.break_[2];
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
      }
   }
}
