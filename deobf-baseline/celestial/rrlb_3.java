package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrlb_3 extends rrTF<Spider> implements rrnF_2 {
   private static boolean[] id_break;
   private static float[] id_byte;
   private static byte[] id_protected;
   private static short[] id_case;
   private static String[] id_catch;
   private static double[] id_private;
   public Object[] id_class;

   private void id_int() {
      Spider var1 = this.id_continue();
      String var2 = id_catch[0];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_case[71]]).id_class(new rrtx_3(var1.id_final(), var2, id_case[72]));
      rrfu_3.id_byte(rrfu_3.id_class((Module)var1) + var2);
   }

   public rrlb_3(Spider var1) {
      super(var1);
      this.id_else();
      rrTT var6 = new rrTT(this);
      this.id_class[id_case[0]] = var6;
      rrmi_3 var7 = new rrmi_3();
      this.id_class[id_case[1]] = var7;
   }

   static {
      ntfClinit();
   }

   private Pair<rfl_3, rjU_2> id_this() {
      rjU_2 var1 = null;
      List var2 = ((gm_3)id_import.id_class[id_case[29]])
         .id_break(
            (cb_3)id_import.id_class[id_case[30]],
            ((cb_3)id_import.id_class[id_case[31]]).rN().id_byte(id_private[2], id_private[3], id_private[4]),
            (var0, var1x) -> {
               if (var0.id_byte().id_throws()) {
                  return id_break[14];
               } else {
                  return var0.id_byte().id_class() ? id_break[15] : var0.id_byte().id_break();
               }
            }
         )
         .sorted((var0, var1x) -> {
            rjU_2 var2x = var0.id_class().rr();
            rjU_2 var3x = var1x.id_class().rr();
            rjU_2 var4x = ((cb_3)id_import.id_class[id_case[79]]).Ps();
            return Double.compare(var4x.id_case(var2x), var4x.id_case(var3x));
         })
         .toList();
      rfl_3 var3 = null;
      if (!var2.isEmpty()) {
         var3 = ((rjC_2)var2.get(id_break[5])).id_class();
         double var4 = var3.id_break;
         double var6 = id_private[5];
         if (((cb_3)id_import.id_class[id_case[32]]).h() && var3.id_byte() > var6) {
            var4 += var6;
         }

         var1 = new rjU_2(var3.id_class, var4, var3.id_byte);
      }

      return var3 == null ? null : Pair.of(var3, var1);
   }

   private int id_class(rff_3 var1, int var2) {
      this.id_else();
      int var3 = ((rhz_3)((cb_3)id_import.id_class[id_case[36]]).id_implements[id_case[37]]).id_protected;
      if (var2 == id_protected[6]) {
         this.id_class(var1, rpm_3.MAIN_HAND);
         return var2;
      } else if (var2 == id_protected[7]) {
         this.id_class(var1, rpm_3.OFF_HAND);
         return var2;
      } else if (var2 >= 0 && var2 < id_protected[8]) {
         ((rhz_3)((cb_3)id_import.id_class[id_case[38]]).id_implements[id_case[39]]).id_protected = var2;
         this.id_class(var1, rpm_3.MAIN_HAND);
         ((rhz_3)((cb_3)id_import.id_class[id_case[40]]).id_implements[id_case[41]]).id_protected = var3;
         return var2;
      } else if (var2 >= id_protected[9] && var2 <= id_protected[10]) {
         if (!((rrmi_3)this.id_class[id_case[42]]).id_class()) {
            rdn_3 var4 = ((rhz_3)((cb_3)id_import.id_class[id_case[43]]).id_implements[id_case[44]]).id_extends(var2);
            ((rrmi_3)this.id_class[id_case[45]]).id_class(var4, var2);
            ((Ax_1)id_import.id_class[id_case[46]])
               .id_class(
                  ((rJr_1)((cb_3)id_import.id_class[id_case[47]]).id_implements[id_case[48]]).id_case,
                  var2,
                  ((rhz_3)((cb_3)id_import.id_class[id_case[49]]).id_implements[id_case[50]]).id_protected,
                  rXa_1.SWAP,
                  var4
               );
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[51]]).id_finally().id_class(rrLY.id_class());
         }

         return id_protected[11];
      } else {
         return id_protected[12];
      }
   }

   @EventTarget
   public void id_class(rrAo_1 var1) {
      this.id_else();
      if ((Boolean)this.id_class[id_case[33]]) {
         var1.id_break(id_break[6]);
         ((cb_3)id_import.id_class[id_case[34]]).sl();
         Boolean var6 = id_break[7];
         this.id_class[id_case[35]] = var6;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3908916578963461319L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 753919623;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, -6, -2, 58, 93, 108, -18, 66}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_class(rff_3 var1, rpm_3 var2) {
      ((Ax_1)id_import.id_class[id_case[52]]).id_package();
      ((Aq_1)((cb_3)id_import.id_class[id_case[53]]).id_break[id_case[54]]).id_class(new rZx_1(var2, var1));
   }

   @EventTarget(
      id_class = 100
   )
   public void id_class(q_1 var1) {
      this.id_else();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[2]]) {
         Boolean var22 = id_break[0];
         this.id_class[id_case[3]] = var22;
         ((rrTT)this.id_class[id_case[4]]).id_final();
         Pair var2 = this.id_this();
         if (var2 == null) {
            Integer var23 = Integer.valueOf(id_protected[0]);
            this.id_class[id_case[5]] = var23;
            return;
         }

         rjU_2 var24 = (rjU_2)var2.getRight();
         this.id_class[id_case[6]] = var24;
         double var3 = ((rfl_3)var2.getLeft()).id_break() * id_private[0];
         double var5 = ((rjU_2)this.id_class[id_case[7]]).id_break + var3 - ((cb_3)id_import.id_class[id_case[8]]).rx();
         double var7 = ((rjU_2)this.id_class[id_case[9]]).id_byte + id_private[1] - ((cb_3)id_import.id_class[id_case[10]]).rH();
         double var9 = ((rjU_2)this.id_class[id_case[11]]).id_protected + var3 - ((cb_3)id_import.id_class[id_case[12]]).BO();
         PX var11 = PJ.id_class(var5, var7, var9).id_case(((cb_3)id_import.id_class[id_case[13]]).h() ? id_byte[0] : id_byte[1]);
         ((rrTT)this.id_class[id_case[14]]).id_class((rrTg_1)() -> var11, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_case[15]]);
         if ((Boolean)((cb_3)id_import.id_class[id_case[16]]).id_throws[id_case[17]] && rrfj_3.id_catch()) {
            if (Ph_1.id_class((cb_3)id_import.id_class[id_case[18]], var11, (double)((Ax_1)id_import.id_class[id_case[19]]).id_byte()) instanceof rff_3 var13) {
               rfH_2 var14 = var13.id_class();
               xc_3 var15 = ((gm_3)id_import.id_class[id_case[20]]).id_byte(var14);
               if (!var15.id_catch()) {
                  int var16 = this.id_public();
                  if (var16 != id_protected[1]) {
                     Boolean var25 = id_break[1];
                     this.id_class[id_case[21]] = var25;
                     if ((Integer)this.id_class[id_case[22]] < id_protected[2]) {
                        Integer var26 = (Integer)this.id_class[id_case[23]] + id_break[2];
                        this.id_class[id_case[24]] = var26;
                     }

                     int var17 = this.id_class(var13, var16);
                     if (var17 != id_protected[3] && (Integer)this.id_class[id_case[25]] == id_protected[4]) {
                        Boolean var27 = id_break[3];
                        this.id_class[id_case[26]] = var27;
                        Integer var28 = Integer.valueOf(id_break[4]);
                        this.id_class[id_case[27]] = var28;
                     }
                  }
               }
            } else {
               Integer var29 = Integer.valueOf(id_protected[5]);
               this.id_class[id_case[28]] = var29;
            }
         }
      }
   }

   @Override
   public float id_break() {
      return id_byte[2];
   }

   @Override
   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_case[77]];
   }

   private static void id_goto() {
      id_protected = new byte[]{3, -1, 3, -1, 3, 3, -2, -3, 9, 9, 36, -1, -1, -1, 3, -1, -2, -3, 36, -1, 6, 3, 4, 5};
   }

   private void id_else() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         this.id_class[3] = false;
         this.id_class[4] = false;
         this.id_class[5] = 0;
      }
   }

   private static void id_new() {
      id_byte = new float[]{65.0F, 74.2F, -1.0F, -1.0F};
   }

   private static void id_package() {
      id_private = new double[]{0.5, 0.5, 0.01F, 0.0, 0.01F, 0.5};
   }

   private static void id_return() {
      id_case = new short[]{
         0,
         1,
         0,
         3,
         0,
         5,
         2,
         2,
         57,
         2,
         57,
         2,
         57,
         57,
         0,
         0,
         57,
         23,
         57,
         55,
         56,
         3,
         5,
         5,
         5,
         5,
         4,
         5,
         5,
         56,
         57,
         57,
         57,
         4,
         57,
         4,
         57,
         1,
         57,
         1,
         57,
         1,
         1,
         57,
         1,
         1,
         55,
         57,
         4,
         57,
         1,
         0,
         55,
         57,
         0,
         57,
         56,
         0,
         0,
         2,
         3,
         5,
         1,
         1,
         1,
         55,
         57,
         4,
         1,
         0,
         1,
         0,
         2000,
         57,
         57,
         57,
         1,
         0,
         3,
         57
      };
   }

   private static void id_while() {
      id_break = new boolean[]{false, true, true, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false};
   }

   private int id_public() {
      if (rrjS_2.id_byte(((cb_3)id_import.id_class[id_case[73]]).ss())) {
         return id_protected[16];
      } else if (rrjS_2.id_byte(((cb_3)id_import.id_class[id_case[74]]).Sn())) {
         return id_protected[17];
      } else {
         for (int var1 = id_break[13]; var1 < id_protected[18]; var1++) {
            rdn_3 var2 = ((rhz_3)((cb_3)id_import.id_class[id_case[75]]).id_implements[id_case[76]]).id_extends(var1);
            if (rrjS_2.id_byte(var2)) {
               return var1;
            }
         }

         return id_protected[19];
      }
   }

   @Override
   public float id_private() {
      return id_byte[3];
   }

   public boolean id_final() {
      this.id_else();
      return (Boolean)this.id_class[id_case[78]];
   }

   private static void id_synchronized() {
      id_catch = new String[]{new String("Не найдено морской травы в инвентаре")};
   }

   @Override
   public boolean aI_() {
      if ((cb_3)id_import.id_class[id_case[55]] != null && (gm_3)id_import.id_class[id_case[56]] != null) {
         int var1 = this.id_public();
         if (var1 == id_protected[13]) {
            this.id_int();
            this.id_continue().id_volatile();
            return id_break[9];
         } else {
            return super.aI_();
         }
      } else {
         return id_break[8];
      }
   }

   @Override
   public boolean aK_() {
      this.id_else();
      ((rrTT)this.id_class[id_case[57]]).id_final();
      ((rrTT)this.id_class[id_case[58]]).id_finally();
      Object var7 = null;
      this.id_class[id_case[59]] = var7;
      Boolean var8 = id_break[10];
      this.id_class[id_case[60]] = var8;
      Integer var9 = Integer.valueOf(id_protected[14]);
      this.id_class[id_case[61]] = var9;
      if (((rrmi_3)this.id_class[id_case[62]]).id_class()) {
         int var1 = ((rrmi_3)this.id_class[id_case[63]]).id_break();
         int var2 = ((rrmi_3)this.id_class[id_case[64]]).id_class(id_break[11]);
         if (var2 != id_protected[15]) {
            ((Ax_1)id_import.id_class[id_case[65]])
               .id_class(
                  ((rJr_1)((cb_3)id_import.id_class[id_case[66]]).id_implements[id_case[67]]).id_case,
                  var1,
                  var2,
                  rXa_1.SWAP,
                  ((rrmi_3)this.id_class[id_case[68]]).id_byte()
               );
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[69]]).id_finally().id_class(rrLY.id_class());
         }
      }

      ((rrmi_3)this.id_class[id_case[70]]).id_throws();
      return super.aK_();
   }
}
