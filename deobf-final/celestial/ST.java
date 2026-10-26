package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ST extends Sv_1 {
   private static String[] protected_;
   private static short[] throws_;
   private static float[] case_;
   public static Object[] break_;
   private static long[] catch_;
   private static double[] private_;
   public Object[] byte_;
   private static byte[] implements_;
   private static boolean[] finally_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{34, -70, 112, 120, -20, -107, -89, -122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void byte_() {
      super.byte_();
      this.private_();
   }

   private boolean int_() {
      String var1 = this.final_();
      return var1 != null && var1.contains("выбор") ? true : finally_[14];
   }

   public ST(SL var1) {
      super(var1);
      this.volatile_();
      rrfw_3 var6 = new rrfw_3();
      this.byte_[0] = var6;
      rrfw_3 var7 = new rrfw_3();
      this.byte_[1] = var7;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new long[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 46404849;
   }

   @Override
   public void class_(rrAM var1) {
      this.volatile_();
      super.class_(var1);
      this.case_().class_();
      ((rrfw_3)this.byte_[1]).class_();
   }

   private rdn_3 class_(rqs_3<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.continue_().byte_().toLowerCase();
         if (var4.contains("мега гриф")) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public void class_(rrLO var1) {
      super.class_(var1);
      String var2 = var1.protected_();
      if (Arrays.<String>stream((String[])break_[0]).anyMatch(var1x -> var2.toLowerCase().contains(var1x.toLowerCase()))) {
         this.private_();
      }
   }

   @Override
   public void class_(q_1 var1) {
      this.volatile_();
      super.class_(var1);
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         SC var2 = this.case_().catch_();
         if (var2 == null) {
            return;
         }

         if (var2 instanceof SF var3) {
            long var4 = var3.class_();
            if (var4 > 0L && !((rrfw_3)this.byte_[1]).class_((double)var4)) {
               return;
            }
         }

         if (!this.implements_()) {
            return;
         }

         vm_3 var10 = (vm_3)import_.class_[73];
         if (var10 instanceof Fc_1 var9) {
            String var11 = this.final_();
            rqs_3 var5 = var9.G_().extends_();
            rdn_3 var6 = this.class_(var2, var5);
            if (var11 == null) {
               return;
            }

            String var7 = var2.byte_();
            if (var7.equalsIgnoreCase("mega") || var7.equalsIgnoreCase("мега")) {
               rdn_3 var8 = this.class_(var5);
               if (var8 != null) {
                  this.class_(var5.indexOf(var8), false);
                  return;
               }
            }

            if (var11.contains("выбор сервера")) {
               rdn_3 var12 = this.break_(var5);
               if (var12 != null) {
                  this.class_(var5.indexOf(var12), false);
                  return;
               }
            }

            if (var6 != null) {
               this.class_(var5.indexOf(var6), true);
            } else if (var11.contains("выбор мира грифа")) {
               this.private_();
            }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8372644447437334382L;
   }

   @Override
   public void class_(rrAl_1 var1) {
      this.volatile_();
      super.class_(var1);
      if (var1.class_() > 10.0F && (Boolean)this.byte_[2]) {
         this.private_();
         Boolean var6 = false;
         this.byte_[2] = var6;
      }
   }

   private rdn_3 class_(SC var1, List<rdn_3> var2) {
      try {
         int var3 = Integer.parseInt(var1.byte_());

         for (rdn_3 var5 : var2) {
            if (!var5.class_() && var5.continue_().byte_().contains("#" + var3)) {
               return var5;
            }
         }

         return null;
      } catch (NumberFormatException var6) {
         return null;
      }
   }

   private void class_(int var1, boolean var2) {
      this.volatile_();
      if (((rrfw_3)this.byte_[0]).class_(200.0)) {
         ((Ax_1)import_.class_[55]).class_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, var1, 1, rXa_1.PICKUP);
         if (var2) {
            Boolean var7 = false;
            this.byte_[2] = var7;
         }

         ((rrfw_3)this.byte_[0]).class_();
      }
   }

   @Override
   public boolean break_(String var1) {
      return !rql_3.break_(var1) ? true : finally_[1];
   }

   private rdn_3 break_(rqs_3<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.continue_().byte_().toLowerCase();
         if (var4.contains("гриферское выживание")) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public String throws_() {
      return C_throws.byte_().final_().throws_();
   }

   private static void finally_() {
      case_ = new float[]{10.0F};
   }

   private static void extends_() {
      private_ = new double[]{200.0};
   }

   private static void continue_() {
      throws_ = new short[]{0, 1, 0, 1, 73, 2, 2, 1, 0, 2, 73, 73, 2, 57, 1, 2, 57, 41, 57, 0, 57, 1, 57, 0, 0, 55, 57, 4, 2, 0, 73, 0, 2};
   }

   private boolean implements_() {
      this.volatile_();
      if (this.int_()) {
         Boolean var6 = true;
         this.byte_[2] = var6;
         return true;
      } else {
         if ((vm_3)import_.class_[73] != null && ((vm_3)import_.class_[73]).throw_() > 2) {
            Boolean var7 = false;
            this.byte_[2] = var7;
         }

         int var1 = rrfY_2.break_(rdy_3.Xx);
         if (var1 == -1) {
            return false;
         } else {
            if (var1 >= 0) {
               ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = var1;
            } else if (!(Boolean)this.byte_[2] && (Integer)((cb_3)import_.class_[57]).throws_[41] % 5 == 0) {
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rme_3(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_));
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZd_1(var1 == -2 ? rpm_3.MAIN_HAND : rpm_3.OFF_HAND));
            }

            return finally_[10];
         }
      }
   }

   private static void new_() {
      implements_ = new byte[]{2, -1, 5, -2, 3, 2, 3, 2};
   }

   private static void package_() {
      Object[] var0 = new Object[1];
      String[] var2 = new String[]{"К сожалению сервер переполнен.", "На сервер заходит большой поток игроков.", "Вы уже подключаетесь к серверу!"};
      var0[0] = var2;
      break_ = var0;
   }

   private static void super_() {
      finally_ = new boolean[]{
         true, false, false, false, true, false, true, true, false, false, false, true, false, true, false, false, false, true, false, false, true
      };
   }

   private void private_() {
      this.volatile_();
      ((rrfw_3)this.byte_[0]).class_();
      Boolean var5 = false;
      this.byte_[2] = var5;
   }

   private String final_() {
      vm_3 var2 = (vm_3)import_.class_[73];
      return var2 instanceof Fc_1 var1 ? var1.new_().byte_().toLowerCase() : null;
   }

   private void volatile_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[3];
         Object[] var1 = this.byte_;
         var1[2] = false;
      }
   }

   private static void native_() {
      protected_ = new String[]{
         new String("mega"),
         new String("мега"),
         new String("выбор сервера"),
         new String("выбор мира грифа"),
         new String("выбор"),
         new String("гриферское выживание"),
         new String("мега гриф"),
         new String("К сожалению сервер переполнен."),
         new String("На сервер заходит большой поток игроков."),
         new String("Вы уже подключаетесь к серверу!")
      };
   }
}
