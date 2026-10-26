package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class StructureTimer extends Module {
   private static short[] byte_;
   private static boolean[] protected_;
   private static String[] throws_;
   public Object[] break_;
   private static double[] catch_;
   private static float[] private_;
   private static byte[] implements_;

   public void byte_(rryB var1) {
      this.protected_(var1);
   }

   public StructureTimer() {
      super("Structure Timer", "Отображает время действия\nтрапок и пластов", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.else_();
      ArrayList var5 = new ArrayList();
      this.break_[0] = var5;
      HashSet var6 = new HashSet();
      this.break_[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new double[]{400.0, 1.5, 1.0};
   }

   public void class_(List<rryB> var1) {
      this.else_();
      Iterator var2 = ((Set)this.break_[1]).iterator();

      while (var2.hasNext()) {
         rryB var3 = (rryB)var2.next();
         if (!var1.contains(var3)) {
            this.throws_(var3);
            var3.class_(false);
            var2.remove();
         }
      }

      for (rryB var4 : var1) {
         if (((Set)this.break_[1]).add(var4)) {
            this.byte_(var4);
            var4.class_(true);
         }

         this.class_(var4);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5405592418121208436L;
   }

   @EventTarget
   public void class_(rrnQ_2 var1) {
      this.catch_(new rryP(var1.class_(), var1.break_()));
   }

   @EventTarget
   public void class_(rrnE_2 var1) {
      this.else_();
      if (!((List)this.break_[0]).isEmpty()) {
         Ml_1 var2 = var1.class_();
         rrZO var3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).private_();
         rjV_2 var4 = ((Hh_1)import_.class_[16]).volatile_();
         int var5 = var3.class_();
         var2.class_();

         for (rryB var7 : (List)this.break_[0]) {
            AnimValue var8 = var7.finally_();
            int var9 = var7.implements_();
            var8.class_(var9 > 0 && !var7.final_() ? true : protected_[1]);
            float var10 = var8.byte_();
            if (var8.case_()) {
               rjU_2 var11 = var7.class_();
               rji_3 var12 = rrfa_3.class_(var4, var11);
               float var13 = var12.class_();
               float var14 = var12.break_();
               String var15 = var7.case_() + rgF_2.GRAY + " » " + rgF_2.RED + var9 + " сек.";
               float var16 = var3.break_(var15) / 2.0F;
               float var17 = 12.0F;
               if (class_(var13 + var16, var14 - var17, var13 - var16, (float)var5 + var17)) {
                  rrfD_2.class_(
                     var2,
                     var7.break_(),
                     var13 - 8.0F,
                     var14 - var17 + (float)(Math.sin((double)System.currentTimeMillis() / 400.0) * 1.5),
                     var10,
                     0.5F,
                     0.0F,
                     0.0F,
                     0
                  );
                  var3.class_(var2, var15, var13, var14, ColorHelper.break_(rrZF.d_, (int)(var10 * 255.0F)), false);
               }
            }
         }

         var2.break_();
      }
   }

   @EventTarget
   public void class_(rrFK var1) {
      this.return_();
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.else_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (((List)this.break_[0]).isEmpty()) {
            return;
         }

         ArrayList var2 = new ArrayList();
         rfl_3 var3 = ((cb_3)import_.class_[57]).rN().class_(1.0);

         for (rryB var5 : (List)this.break_[0]) {
            if (var5.byte_().byte_(var3)) {
               var2.add(var5);
            }
         }

         this.class_(var2);
      }
   }

   @EventTarget
   public void class_(j_1 var1) {
      this.else_();
      if (!((List)this.break_[0]).isEmpty()) {
         ((List)this.break_[0]).removeIf(var1x -> {
            var1x.native_();
            boolean var2 = var1x.extends_() && !var1x.finally_().case_() ? true : protected_[12];
            if (var2 && var1x.final_()) {
               this.break_(var1x);
            }

            return var2;
         });
      }
   }

   public void class_(rryB var1) {
      this.class_(var1, ((cq_3)import_.class_[19]).extends_().catch_().get(var1.catch_()));
   }

   private static boolean class_(float var0, float var1, float var2, float var3) {
      return var2 < const_.volatile_() && var0 > 0.0F && var1 < const_.final_() && var1 > -var3 ? true : protected_[10];
   }

   public void class_(rryB var1, cd_3 var2) {
      if (var2 != null) {
         rgP_2 var3 = var2.implements_();
         rVi_1 var4 = this.private_(var1);
         if (!var4.equals(var3)) {
            var2.class_(1.0F - var1.volatile_());
         }

         var2.class_(var4);
         if (var2.class_() <= 0.0F) {
            this.break_(var1);
         }
      }
   }

   @EventTarget
   public void class_(rrAM var1) {
      this.return_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -211227419;
   }

   @EventTarget
   public void class_(rrnN_2 var1) {
      this.catch_(new rryS(var1.class_(), var1.break_()));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-68, -58, 18, -20, -37, -86, 70, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void break_(rryB var1) {
      ((cq_3)import_.class_[19]).extends_().catch_().remove(var1.catch_());
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      this.return_();
   }

   public void throws_(rryB var1) {
      this.break_(var1);
   }

   private void catch_(rryB var1) {
      this.else_();
      ((List)this.break_[0]).add(var1);
   }

   private static void goto_() {
      byte_ = new short[]{2, 0, 1, 0, 0, 16, 0, 0, 0, 57, 0, 0, 0, 19, 0, 0, 0, 1, 1, 1, 19, 19};
   }

   private static void continue_() {
      implements_ = new byte[]{2};
   }

   private void else_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
      }
   }

   private static void new_() {
      throws_ = new String[]{new String("Structure Timer"), new String("Отображает время действия\nтрапок и пластов")};
   }

   private void return_() {
      this.try_();
      this.super_();
   }

   private void super_() {
      this.else_();
      ((Set)this.break_[1]).clear();
   }

   private void try_() {
      this.else_();

      for (rryB var2 : (List)this.break_[0]) {
         this.break_(var2);
      }

      ((List)this.break_[0]).clear();
   }

   private static void while_() {
      private_ = new float[]{2.0F, 12.0F, 8.0F, 0.5F, 0.0F, 0.0F, 255.0F, 1.0F, 1.0F, 0.0F, 0.0F};
   }

   private static void public_() {
      protected_ = new boolean[]{true, false, false, false, false, true, false, false, false, true, false, true, false};
   }

   public void protected_(rryB var1) {
      UUID var2 = var1.catch_();
      ((cq_3)import_.class_[19])
         .extends_()
         .catch_()
         .put(var2, new cd_3(var2, this.private_(var1), rRb_1.WHITE, rRM.PROGRESS, 1.0F - var1.volatile_(), false, false, false));
   }

   private rVi_1 private_(rryB var1) {
      return new rgN_2(var1.case_()).class_(new rgN_2(", исчезнет через " + rgF_2.RED + var1.implements_() + " сек."));
   }
}
