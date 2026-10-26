package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ClanUpgrader extends Module implements rrnF_2 {
   private static byte[] id_protected;
   private static String[] id_throws;
   private static boolean[] id_catch;
   private static double[] id_private;
   private static short[] id_implements;
   public static Object[] id_break;
   private static float[] id_finally;
   public Object[] id_byte;

   public ClanUpgrader() {
      super(id_throws[0], id_throws[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_this();
      rrTT var5 = new rrTT(this);
      this.id_byte[id_implements[1]] = var5;
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_byte == null) {
         this.id_byte = new Object[1];
      }
   }

   private void id_class(rff_3 var1, rpm_3 var2) {
      ((Ax_1)id_import.id_class[55]).id_package();
      ((Ax_1)id_import.id_class[55]).id_break((cb_3)id_import.id_class[57], (gm_3)id_import.id_class[56], var2, var1);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -596591421;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4343885293657940403L;
   }

   @Override
   public void id_class(boolean var1) {
      if (this.id_try() == -1) {
         this.id_new();
      } else {
         super.id_class(var1);
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_this();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_implements[2]]) {
         int var2 = this.id_try();
         if (var2 == -1) {
            ((rrTT)this.id_byte[id_implements[3]]).id_final();
            return;
         }

         Set var3 = this.id_continue();
         if (!var3.isEmpty()) {
            rfH_2 var4 = (rfH_2)var3.iterator().next();
            ((rrTT)this.id_byte[id_implements[4]]).id_class(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_implements[5]]);
         } else {
            ((rrTT)this.id_byte[id_implements[6]])
               .id_class(((cb_3)id_import.id_class[57]).Bs(), (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_implements[8]]);
         }

         if (((cb_3)id_import.id_class[57]).id_return()) {
            return;
         }

         if (Ph_1.id_class((cb_3)id_import.id_class[57], ((rrTT)this.id_byte[id_implements[11]]).id_byte(), (double)((Ax_1)id_import.id_class[55]).id_byte()) instanceof rff_3 var5
            && var5.id_byte() == rjM_2.BLOCK) {
            rpr_3 var6 = var5.id_break();
            if (var6 == rpr_3.UP) {
               rfH_2 var7 = var5.id_class();
               xc_3 var8 = ((gm_3)id_import.id_class[56]).id_byte(var7);
               if (var8.id_catch()) {
                  return;
               }

               boolean var9 = id_catch[0];
               if (var2 >= 0) {
                  rrfo_3.id_class(var2);
                  var9 = true;
               }

               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_implements[15]]).id_break(new rZx_1(var2 == -3 ? rpm_3.OFF_HAND : rpm_3.MAIN_HAND, var5));
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_implements[17]]).id_break(new rZb_1(rZM.START_DESTROY_BLOCK, var7.id_final(), var6));
               ((cb_3)id_import.id_class[57]).id_class(rpm_3.MAIN_HAND);
               if (var9) {
                  rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
               }
            }
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, 93, 32, -67, 127, -21, -128, 93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public float id_break() {
      return -1.0F;
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_this();
      super.id_throws(var1);
      ((rrTT)this.id_byte[id_implements[28]]).id_final();
   }

   @Override
   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_implements[31]];
   }

   private static void id_goto() {
      id_private = new double[]{1.0};
   }

   private Set<rfH_2> id_continue() {
      Stream var1 = ((gm_3)id_import.id_class[56])
         .id_break(
            (cb_3)id_import.id_class[57],
            ((cb_3)id_import.id_class[57]).rN().id_class(1.0),
            (var0, var1x) -> ((Predicate)id_break[id_implements[32]]).test(var0)
         );
      return var1.<rfl_3>map(rjC_2::id_class).map(rfH_2::new).collect(Collectors.toSet());
   }

   private static void id_else() {
      Object[] var0 = new Object[]{
         (Predicate<xc_3>)var0x -> var0x.id_catch() || var0x.id_break() != xu_3.rR && var0x.id_break() != xu_3.ra ? id_catch[4] : true
      };
      id_break = var0;
   }

   private static void id_instanceof() {
      id_finally = new float[]{-1.0F, -1.0F};
   }

   private void id_new() {
      String var1 = id_throws[2];
      rrfu_3.id_byte(rrfu_3.id_class((Module)this) + var1);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_implements[29]]).id_class(new rrtx_3(this.id_final(), var1, 2000));
      this.id_byte(id_catch[2]);
   }

   private static void id_return() {
      id_throws = new String[]{
         new String("Clan Upgrader"), new String("Помогает в улучшении клана на\nFuntime"), new String("Нет факелов или редстоуна в хотбаре")
      };
   }

   private static void id_super() {
      id_protected = new byte[]{-1, -3, -1, -1, -1, -1};
   }

   private int id_try() {
      int var1 = rrfY_2.id_break(rdy_3.Pu);
      int var2 = rrfY_2.id_break(rdy_3.hD);
      if (var1 != -1) {
         return var1;
      } else {
         return var2 != -1 ? var2 : -1;
      }
   }

   private static void id_while() {
      id_catch = new boolean[]{false, true, false, true, false, false, true, true};
   }

   private static void id_public() {
      id_implements = new short[]{4, 0, 0, 0, 0, 0, 0, 57, 0, 57, 57, 0, 55, 56, 57, 0, 57, 0, 57, 57, 1, 55, 55, 57, 56, 56, 57, 57, 0, 0, 2000, 0, 0};
   }

   @Override
   public float id_private() {
      return -1.0F;
   }
}
