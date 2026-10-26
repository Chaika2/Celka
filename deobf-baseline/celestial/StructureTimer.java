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
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static String[] id_throws;
   public Object[] id_break;
   private static double[] id_catch;
   private static float[] id_private;
   private static byte[] id_implements;

   public void id_byte(rryB var1) {
      this.id_protected(var1);
   }

   public StructureTimer() {
      super(id_throws[0], id_throws[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_byte[0]]);
      this.id_else();
      ArrayList var5 = new ArrayList();
      this.id_break[id_byte[1]] = var5;
      HashSet var6 = new HashSet();
      this.id_break[id_byte[2]] = var6;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new double[]{400.0, 1.5, 1.0};
   }

   public void id_class(List<rryB> var1) {
      this.id_else();
      Iterator var2 = ((Set)this.id_break[id_byte[18]]).iterator();

      while (var2.hasNext()) {
         rryB var3 = (rryB)var2.next();
         if (!var1.contains(var3)) {
            this.id_throws(var3);
            var3.id_class(id_protected[4]);
            var2.remove();
         }
      }

      for (rryB var4 : var1) {
         if (((Set)this.id_break[id_byte[19]]).add(var4)) {
            this.id_byte(var4);
            var4.id_class(id_protected[5]);
         }

         this.id_class(var4);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5405592418121208436L;
   }

   @EventTarget
   public void id_class(rrnQ_2 var1) {
      this.id_catch(new rryP(var1.id_class(), var1.id_break()));
   }

   @EventTarget
   public void id_class(rrnE_2 var1) {
      this.id_else();
      if (!((List)this.id_break[id_byte[3]]).isEmpty()) {
         Ml_1 var2 = var1.id_class();
         rrZO var3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_byte[4]]).id_private();
         rjV_2 var4 = ((Hh_1)id_import.id_class[id_byte[5]]).id_volatile();
         int var5 = var3.id_class();
         var2.id_class();

         for (rryB var7 : (List)this.id_break[id_byte[6]]) {
            AnimValue var8 = var7.id_finally();
            int var9 = var7.id_implements();
            var8.id_class(var9 > 0 && !var7.id_final() ? id_protected[0] : id_protected[1]);
            float var10 = var8.id_byte();
            if (var8.id_case()) {
               rjU_2 var11 = var7.id_class();
               rji_3 var12 = rrfa_3.id_class(var4, var11);
               float var13 = var12.id_class();
               float var14 = var12.id_break();
               String var15 = var7.id_case() + rgF_2.GRAY + " » " + rgF_2.RED + var9 + " сек.";
               float var16 = var3.id_break(var15) / id_private[0];
               float var17 = id_private[1];
               if (id_class(var13 + var16, var14 - var17, var13 - var16, (float)var5 + var17)) {
                  rrfD_2.id_class(
                     var2,
                     var7.id_break(),
                     var13 - id_private[2],
                     var14 - var17 + (float)(Math.sin((double)System.currentTimeMillis() / id_catch[0]) * id_catch[1]),
                     var10,
                     id_private[3],
                     id_private[4],
                     id_private[5],
                     id_protected[2]
                  );
                  var3.id_class(var2, var15, var13, var14, ColorHelper.id_break(rrZF.d_, (int)(var10 * id_private[6])), id_protected[3]);
               }
            }
         }

         var2.id_break();
      }
   }

   @EventTarget
   public void id_class(rrFK var1) {
      this.id_return();
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_else();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[7]]) {
         if (((List)this.id_break[id_byte[8]]).isEmpty()) {
            return;
         }

         ArrayList var2 = new ArrayList();
         rfl_3 var3 = ((cb_3)id_import.id_class[id_byte[9]]).rN().id_class(id_catch[2]);

         for (rryB var5 : (List)this.id_break[id_byte[10]]) {
            if (var5.id_byte().id_byte(var3)) {
               var2.add(var5);
            }
         }

         this.id_class(var2);
      }
   }

   @EventTarget
   public void id_class(j_1 var1) {
      this.id_else();
      if (!((List)this.id_break[id_byte[11]]).isEmpty()) {
         ((List)this.id_break[id_byte[12]]).removeIf(var1x -> {
            var1x.id_native();
            boolean var2 = var1x.id_extends() && !var1x.id_finally().id_case() ? id_protected[11] : id_protected[12];
            if (var2 && var1x.id_final()) {
               this.id_break(var1x);
            }

            return var2;
         });
      }
   }

   public void id_class(rryB var1) {
      this.id_class(var1, ((cq_3)id_import.id_class[id_byte[13]]).id_extends().id_catch().get(var1.id_catch()));
   }

   private static boolean id_class(float var0, float var1, float var2, float var3) {
      return var2 < id_const.id_volatile() && var0 > id_private[10] && var1 < id_const.id_final() && var1 > -var3 ? id_protected[9] : id_protected[10];
   }

   public void id_class(rryB var1, cd_3 var2) {
      if (var2 != null) {
         rgP_2 var3 = var2.id_implements();
         rVi_1 var4 = this.id_private(var1);
         if (!var4.equals(var3)) {
            var2.id_class(id_private[8] - var1.id_volatile());
         }

         var2.id_class(var4);
         if (var2.id_class() <= id_private[9]) {
            this.id_break(var1);
         }
      }
   }

   @EventTarget
   public void id_class(rrAM var1) {
      this.id_return();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -211227419;
   }

   @EventTarget
   public void id_class(rrnN_2 var1) {
      this.id_catch(new rryS(var1.id_class(), var1.id_break()));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-68, -58, 18, -20, -37, -86, 70, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_break(rryB var1) {
      ((cq_3)id_import.id_class[id_byte[21]]).id_extends().id_catch().remove(var1.id_catch());
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_return();
   }

   public void id_throws(rryB var1) {
      this.id_break(var1);
   }

   private void id_catch(rryB var1) {
      this.id_else();
      ((List)this.id_break[id_byte[14]]).add(var1);
   }

   private static void id_goto() {
      id_byte = new short[]{2, 0, 1, 0, 0, 16, 0, 0, 0, 57, 0, 0, 0, 19, 0, 0, 0, 1, 1, 1, 19, 19};
   }

   private static void id_continue() {
      id_implements = new byte[]{2};
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   private static void id_new() {
      id_throws = new String[]{new String("Structure Timer"), new String("Отображает время действия\nтрапок и пластов")};
   }

   private void id_return() {
      this.id_try();
      this.id_super();
   }

   private void id_super() {
      this.id_else();
      ((Set)this.id_break[id_byte[17]]).clear();
   }

   private void id_try() {
      this.id_else();

      for (rryB var2 : (List)this.id_break[id_byte[15]]) {
         this.id_break(var2);
      }

      ((List)this.id_break[id_byte[16]]).clear();
   }

   private static void id_while() {
      id_private = new float[]{2.0F, 12.0F, 8.0F, 0.5F, 0.0F, 0.0F, 255.0F, 1.0F, 1.0F, 0.0F, 0.0F};
   }

   private static void id_public() {
      id_protected = new boolean[]{true, false, false, false, false, true, false, false, false, true, false, true, false};
   }

   public void id_protected(rryB var1) {
      UUID var2 = var1.id_catch();
      ((cq_3)id_import.id_class[id_byte[20]])
         .id_extends()
         .id_catch()
         .put(
            var2,
            new cd_3(
               var2, this.id_private(var1), rRb_1.WHITE, rRM.PROGRESS, id_private[7] - var1.id_volatile(), id_protected[6], id_protected[7], id_protected[8]
            )
         );
   }

   private rVi_1 id_private(rryB var1) {
      return new rgN_2(var1.id_case()).id_class(new rgN_2(", исчезнет через " + rgF_2.RED + var1.id_implements() + " сек."));
   }
}
