package celestial;

import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pt_1 extends Pv_1 implements PP {
   private static long[] case_;
   private static short[] catch_;
   public static Object[] break_;
   private static String[] private_;
   private static byte[] implements_;
   private static boolean[] finally_;
   public Object[] throws_;

   public long byte_() {
      this.final_();
      return (Long)this.throws_[1];
   }

   public Pt_1(C_class var1) {
      super(var1);
      this.final_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -376988152;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 44244996002526464L;
   }

   @Override
   public void class_(j_1 var1) {
      this.final_();
      if (var1.class_() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[0] && this.catch_()) {
         this.class_();

         try {
            rgP_2 var2 = ((cq_3)b_.class_[catch_[1]]).implements_().protected_();
            if (var2 != null) {
               String var3 = var2.byte_();
               if (!rql_3.break_(var3) && var3.contains(private_[0])) {
                  PI var4 = this.break_(var3);
                  if (var4 != null) {
                     this.throws_[catch_[2]] = var4;
                  }
               }
            }

            for (String var15 : ((cq_3)b_.class_[catch_[3]]).new_()) {
               if (var15.contains(private_[1])) {
                  Matcher var5 = ((Pattern)break_[catch_[4]]).matcher(var15.replace(private_[2], private_[3]));
                  if (var5.find()) {
                     Long var11 = Long.parseLong(var5.group(finally_[0]));
                     this.throws_[catch_[5]] = var11;
                  }
               } else if (var15.contains(private_[4])) {
                  Matcher var16 = ((Pattern)break_[catch_[6]]).matcher(var15.replace(private_[5], private_[6]));
                  if (var16.find()) {
                     Long var12 = Long.parseLong(var16.group(finally_[1]));
                     this.throws_[catch_[7]] = var12;
                  }
               }
            }
         } catch (Exception var13) {
         }
      }
   }

   @Override
   public void class_(rrFK var1) {
      this.class_();
   }

   public void class_() {
      this.final_();
      Object var5 = null;
      this.throws_[0] = var5;
      Long var6 = 0L;
      this.throws_[1] = var6;
      Long var7 = 0L;
      this.throws_[2] = var7;
   }

   public long break_() {
      this.final_();
      return (Long)this.throws_[2];
   }

   public PI break_(String var1) {
      if (rql_3.break_(var1)) {
         return null;
      } else {
         for (Pf_1 var3 : ((EnumMap)break_[0]).keySet()) {
            Matcher var4 = ((Pattern)((EnumMap)break_[0]).get(var3)).matcher(var1);
            if (var4.find()) {
               String var5 = var4.group(1);
               return new PI(var3, var5 != null ? var5 : private_[7]);
            }
         }

         return null;
      }
   }

   private static void throws_() {
      case_ = new long[4];
   }

   private static void finally_() {
      private_ = new String[]{
         new String("Режим:"),
         new String("Монет"),
         new String(","),
         new String(""),
         new String("Токенов"),
         new String(","),
         new String(""),
         new String(""),
         new String("\\$ Монет: (\\d+)"),
         new String("⛁ Токенов: (\\d+)")
      };
   }

   private boolean catch_() {
      return (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
            && (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         ? finally_[3]
         : finally_[2];
   }

   private static void extends_() {
      Object[] var0 = new Object[]{new Pw_1(Pf_1.class), Pattern.compile("\\$ Монет: (\\d+)", 0), Pattern.compile("⛁ Токенов: (\\d+)")};
      break_ = var0;
   }

   private static void case_() {
      catch_ = new short[]{0, 19, 0, 19, 1, 1, 2, 2, 1, 2, 1, 4, 0, 1, 2, 0, 0, 0, 1, 2};
   }

   private static void implements_() {
      finally_ = new boolean[]{true, true, true, false, true, false, true, true};
   }

   public PI protected_() {
      this.final_();
      return (PI)this.throws_[0];
   }

   public static String private_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, 88, -54, -72, 51, -1, -43, -67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void private_() {
      implements_ = new byte[]{2, 3, 2, 3};
   }

   private void final_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[3];
         Object[] var1 = this.throws_;
         var1[1] = 0L;
         var1[2] = 0L;
      }
   }
}
