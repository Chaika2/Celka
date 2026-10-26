package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SD implements D, PP {
   private static boolean[] throws_;
   public Object[] class_;
   public static Object[] break_;
   private static String[] case_;
   private static short[] catch_;
   private static byte[] private_;

   private static void byte_() {
      catch_ = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
   }

   public SD(C_case var1) {
      this.protected_();
      F var6 = var1.switch_();
      this.class_[0] = var6;
      var1.s().class_(this);
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      case_ = new String[]{
         new String("> %s"),
         new String("Click to rerun command"),
         new String("help"),
         new String("set toggle %s"),
         new String("set %s"),
         new String("set %s %s"),
         new String("true"),
         new String("false"),
         new String("false"),
         new String("true")
      };
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{5, 20, 116, -24, 33, -41, -67, 99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(f_1 var1) {
      if ((Boolean)((C_private)break_[0]).l.class_[0]) {
         String var2 = (String)var1.class_[0];
         String var3 = (String)((C_private)break_[0]).protected_.class_[0];
         if (var2.startsWith(var3)) {
            String var4 = var2.substring(var3.length());
            List var5 = sG_2.class_(var4, true);
            Stream var6 = this.private_(var4);
            if (var5.size() == 1) {
               var6 = var6.map(var1x -> var3 + var1x);
            }

            String[] var7 = var6.toArray(String[]::new);
            if (var7.length > 0) {
               var1.class_[1] = var7;
            }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9004151735521084422L;
   }

   @Override
   public void class_(C var1) {
      String var2 = var1.class_();
      String var3 = (String)((C_private)break_[0]).protected_.class_[0];
      boolean var4 = var2.startsWith(C_throw.class_);
      if (var2.startsWith(var3)) {
         var1.break_();
         String var5 = var2.substring(var4 ? C_throw.class_.length() : var3.length());
         if (!this.break_(var5) && !var5.trim().isEmpty()) {
            new N(EJ.throws_(var5).class_()).class_(null, null);
         }
      }
   }

   private void class_(String var1, String var2) {
      if ((Boolean)((C_private)break_[0]).rt.class_[0]) {
         String var3 = var1 + var2;
         String var4 = ((C_private)break_[0]).rp.class_[0] ? var1 + " ..." : var3;
         rVe_1 var5 = new rVe_1(String.format("> %s", var4));
         var5.class_(
            var5.class_()
               .class_(rgF_2.WHITE)
               .class_(new rgy_3(rgp_3.class_, new rgN_2("Click to rerun command")))
               .class_(new rgl_3(rgH_2.RUN_COMMAND, C_throw.class_ + var3))
         );
         this.class_(new rVi_1[]{var5});
      }
   }

   public boolean break_(String var1) {
      if (var1.isEmpty()) {
         return this.break_("help");
      } else {
         rqj_3 var2 = EJ.throws_(var1);
         String var3 = (String)var2.class_();
         String var4 = var1.substring(((String)var2.class_()).length());
         sS_2 var5 = new sS_2((F)this.class_[0], (List<C_import>)var2.break_());
         if (!var5.final_()) {
            C_extends var6 = (C_extends)((Map)((C_private)break_[0]).Pj[0]).get(var3.toLowerCase(Locale.US));
            if (var6 != null) {
               this.class_(var3, var4);
               if (var6.byte_() == Boolean.class) {
                  ((F)this.class_[0]).class_(String.format("set toggle %s", var6.protected_()));
               } else {
                  ((F)this.class_[0]).class_(String.format("set %s", var6.protected_()));
               }

               return throws_[8];
            }
         } else if (var5.case_()) {
            for (C_extends var7 : (List)((C_private)break_[0]).Pj[1]) {
               if (!Pd_1.throws_(var7) && var7.protected_().equalsIgnoreCase((String)var2.class_())) {
                  this.class_(var3, var4);

                  try {
                     F var10000 = (F)this.class_[catch_[14]];
                     String var10001 = case_[5];
                     Object[] var10002 = new Object[private_[0]];
                     var10002[throws_[9]] = var7.protected_();
                     var10002[throws_[10]] = var5.extends_();
                     var10000.class_(String.format(var10001, var10002));
                  } catch (Q var9) {
                  }

                  return throws_[11];
               }
            }
         }

         if (((F)this.class_[0]).break_((String)var2.class_()) != null) {
            this.class_(var3, var4);
         }

         return ((F)this.class_[0]).break_(var2);
      }
   }

   private static void break_() {
      Object[] var0 = new Object[]{C_throws.break_()};
      break_ = var0;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1534519006;
   }

   private static void throws_() {
      private_ = new byte[]{2, 2, 2, 2};
   }

   private static void case_() {
      throws_ = new boolean[]{
         true, false, true, false, true, false, true, false, true, false, true, true, true, true, true, true, false, true, false, true, false, true, true
      };
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public Stream<String> private_(String var1) {
      try {
         List var2 = sG_2.class_(var1, throws_[14]);
         sS_2 var3 = new sS_2((F)this.class_[catch_[23]], var2);
         if (var3.catch_(private_[1])) {
            if (var3.case_(throws_[15])) {
               return new v_1().class_((F)this.class_[catch_[24]]).byte_().class_(var3.extends_()).protected_();
            }

            C_extends var4 = (C_extends)((Map)((C_private)break_[catch_[25]]).Pj[catch_[26]]).get(var3.extends_().toLowerCase(Locale.US));
            if (var4 != null && !Pd_1.throws_(var4)) {
               if (var4.byte_() == Boolean.class) {
                  v_1 var5 = new v_1();
                  if ((Boolean)var4.class_[catch_[27]]) {
                     String[] var10001 = new String[private_[2]];
                     var10001[throws_[16]] = case_[6];
                     var10001[throws_[17]] = case_[7];
                     var5.break_(var10001);
                  } else {
                     String[] var7 = new String[private_[3]];
                     var7[throws_[18]] = case_[8];
                     var7[throws_[19]] = case_[9];
                     var5.break_(var7);
                  }

                  return var5.class_(var3.extends_()).protected_();
               }

               return Stream.of(Pd_1.break_(var4));
            }
         }

         return ((F)this.class_[catch_[28]]).byte_(var1);
      } catch (Q var6) {
         return Stream.empty();
      }
   }
}
