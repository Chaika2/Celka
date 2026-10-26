package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class Ev_1 implements EF, rd_3 {
   private static double[] id_continue;
   public static Object[] id_class;
   public Object[] id_new;
   private static boolean[] id_super;
   private static short[] id_this;
   private static byte[] id_else;

   @Override
   public rfH_2 id_byte() {
      return this.id_implements().id_byte(this.id_break());
   }

   public List<rfH_2> id_byte(bw_3 var1) {
      if ((List)this.id_new[id_this[98]] == null) {
         ArrayList var6 = new ArrayList();
         this.id_new[id_this[99]] = var6;
      }

      return (List<rfH_2>)this.id_new[id_this[100]];
   }

   public void id_byte(double var1) {
      Double var7 = var1;
      this.id_new[id_this[17]] = var7;
   }

   public EA id_byte(EA var1) {
      if (!this.id_break(var1)) {
         return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[65]]);
      } else {
         if (var1.id_byte() == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[66]]) {
            var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[67]]);
         }

         if (var1.id_byte() == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[68]]) {
            var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[69]]);
         }

         return var1;
      }
   }

   public void id_byte(EZ var1) {
      Boolean var6 = ((bw_3)var1.id_break[id_this[70]])
         .id_class((Integer)((rU_2)this.id_new[id_this[71]]).id_break[id_this[72]], (Integer)((rU_2)this.id_new[id_this[73]]).id_break[id_this[74]]);
      this.id_new[id_this[75]] = var6;
   }

   private static void id_int() {
      id_continue = new double[]{0.0, 0.0, 0.0, 1.0, 1.1, 1.0};
   }

   public Ev_1(C_case var1, rU_2 var2, rU_2 var3, rU_2[] var4) {
      this(var1, var2, var3, var4, null);
   }

   public Ev_1(C_case var1, rU_2 var2, rU_2 var3, rU_2[] var4, rU_2 var5) {
      this.id_new();
      EA var10 = new EA().id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[0]]);
      this.id_new[id_this[1]] = var10;
      Object var11 = null;
      this.id_new[id_this[2]] = var11;
      Object var12 = null;
      this.id_new[id_this[3]] = var12;
      Object var13 = null;
      this.id_new[id_this[4]] = var13;
      Object var14 = null;
      this.id_new[id_this[5]] = var14;
      this.id_new[id_this[6]] = var1;
      Ps_1 var16 = var1.id_throw();
      this.id_new[id_this[7]] = var16;
      this.id_new[id_this[8]] = var2;
      this.id_new[id_this[9]] = var3;
      this.id_new[id_this[10]] = var4;
      this.id_new[id_this[11]] = var5;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_this = new short[]{
         0,
         2,
         8,
         9,
         10,
         11,
         0,
         1,
         3,
         4,
         5,
         6,
         7,
         7,
         7,
         7,
         7,
         7,
         11,
         11,
         11,
         11,
         1,
         0,
         1,
         18,
         2,
         2,
         1,
         1,
         2,
         6,
         1,
         1,
         2,
         4,
         2,
         0,
         2,
         2,
         2,
         0,
         2,
         1,
         5,
         1,
         0,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         4,
         1,
         1,
         4,
         4,
         2,
         3,
         4,
         0,
         2,
         0,
         0,
         1,
         1,
         2,
         4,
         4,
         0,
         4,
         2,
         12,
         12,
         8,
         9,
         10,
         8,
         8,
         5,
         0,
         1,
         2,
         8,
         9,
         9,
         6,
         6,
         0,
         6,
         1,
         6,
         2,
         6,
         9,
         10,
         10,
         10,
         5,
         0,
         0,
         2,
         1,
         1
      };
   }

   public List<rfH_2> id_class(bw_3 var1) {
      if ((List)this.id_new[id_this[80]] != null) {
         return (List<rfH_2>)this.id_new[id_this[81]];
      } else {
         ArrayList var2 = new ArrayList();
         rU_2[] var3 = (rU_2[])this.id_new[id_this[82]];
         int var4 = var3.length;

         for (int var5 = id_super[19]; var5 < var4; var5++) {
            rU_2 var6 = var3[var5];
            if (!EF.id_break(var1, (Integer)var6.id_break[id_this[83]], (Integer)var6.id_break[id_this[84]], (Integer)var6.id_break[id_this[85]])) {
               var2.add(var6);
            }
         }

         this.id_new[id_this[86]] = var2;
         return var2;
      }
   }

   @Override
   public void id_class() {
      EA var5 = new EA().id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[63]]);
      this.id_new[id_this[64]] = var5;
   }

   public abstract double id_class(EZ var1);

   public boolean id_class(EA var1) {
      return id_super[18];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7757147260034478975L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -45, -52, 85, 21, 56, -82, -107}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_break(EA var1) {
      if (var1.id_byte() == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[43]]) {
         return id_super[5];
      } else {
         boolean var2 = id_super[6];
         rU_2[] var3 = (rU_2[])this.id_new[id_this[44]];
         int var4 = var3.length;

         for (int var5 = id_super[7]; var5 < var4; var5++) {
            rU_2 var6 = var3[var5];
            if (!((Ps_1)this.id_new[id_this[45]])
                  .id_case()
                  .id_class(
                     rsB_2.class, new rfl_3(id_continue[0], id_continue[1], id_continue[2], id_continue[3], id_continue[4], id_continue[5]).id_class(var6)
                  )
                  .isEmpty()
               && (Boolean)C_class.id_instanceof().PL.id_class[id_this[46]]) {
               return id_super[8];
            }

            if (!EF.id_class((Ps_1)this.id_new[id_this[47]], var6) && !(bw_3.id_break((Ps_1)this.id_new[id_this[48]], var6) instanceof dj_3)) {
               var2 = id_super[9];
               EF.id_class((Ps_1)this.id_new[id_this[49]], bw_3.id_class((Ps_1)this.id_new[id_this[50]], var6));
               Optional var7 = PJ.id_class((Ps_1)this.id_new[id_this[51]], var6, ((Ps_1)this.id_new[id_this[52]]).id_native().id_case());
               if (!var7.isPresent()) {
                  var1.id_class(
                     new En_1(
                        PJ.id_class(((Ps_1)this.id_new[id_this[56]]).id_finally(), Pu_1.id_class(var6), ((Ps_1)this.id_new[id_this[57]]).id_protected()),
                        id_super[13]
                     )
                  );
                  var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[58]], id_super[14]);
                  return id_super[15];
               }

               PX var8 = ((Px_1)var7.get()).id_class();
               var1.id_class(new En_1(var8, id_super[10]));
               if (((Ps_1)this.id_new[id_this[53]]).id_class(var6) || ((Ps_1)this.id_new[id_this[54]]).id_protected().id_class(var8)) {
                  var1.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[55]], id_super[11]);
               }

               return id_super[12];
            }
         }

         if (var2) {
            var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[59]]);
            return id_super[16];
         } else {
            return id_super[17];
         }
      }
   }

   public List<rfH_2> id_break(bw_3 var1) {
      if ((List)this.id_new[id_this[87]] != null) {
         return (List<rfH_2>)this.id_new[id_this[88]];
      } else {
         ArrayList var2 = new ArrayList();
         if ((rU_2)this.id_new[id_this[89]] != null
            && !EF.id_byte(
               var1,
               (Integer)((rU_2)this.id_new[id_this[90]]).id_break[id_this[91]],
               (Integer)((rU_2)this.id_new[id_this[92]]).id_break[id_this[93]],
               (Integer)((rU_2)this.id_new[id_this[94]]).id_break[id_this[95]]
            )) {
            var2.add((rU_2)this.id_new[id_this[96]]);
         }

         this.id_new[id_this[97]] = var2;
         return var2;
      }
   }

   @Override
   public rU_2 id_break() {
      return (rU_2)this.id_new[id_this[61]];
   }

   public double id_break(EZ var1) {
      if ((Double)this.id_new[id_this[13]] == null) {
         Double var6 = this.id_class(var1);
         this.id_new[id_this[14]] = var6;
      }

      return (Double)this.id_new[id_this[15]];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1978203550;
   }

   @Override
   public double id_throws() throws NullPointerException {
      return (Double)this.id_new[id_this[12]];
   }

   public rfH_2[] id_finally() {
      return (rU_2[])this.id_new[id_this[101]];
   }

   @Override
   public rk_3 id_catch() {
      ((rhx_3)((Ps_1)this.id_new[id_this[24]]).id_catch().id_implements[id_this[25]]).id_break = id_super[2];
      EA var5 = this.id_byte((EA)this.id_new[id_this[26]]);
      this.id_new[id_this[27]] = var5;
      if (EF.id_protected((Ps_1)this.id_new[id_this[28]], ((Ps_1)this.id_new[id_this[29]]).id_volatile())) {
         ((EA)this.id_new[id_this[30]]).id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[31]], id_super[3]);
      }

      if (((Ps_1)this.id_new[id_this[32]]).id_catch().Bz()) {
         ((Ps_1)this.id_new[id_this[33]])
            .id_class()
            .ifPresent(var1 -> EF.id_class((Ps_1)this.id_new[id_this[105]], bw_3.id_class((Ps_1)this.id_new[id_this[106]], var1)));
         ((EA)this.id_new[id_this[34]]).id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[35]], id_super[4]);
      }

      ((EA)this.id_new[id_this[36]])
         .id_class()
         .id_break()
         .ifPresent(var1 -> ((Br_1)((C_case)this.id_new[id_this[103]]).id_catch()).id_class(var1, ((EA)this.id_new[id_this[104]]).id_class().id_class()));
      ((C_case)this.id_new[id_this[37]]).id_new().id_class();
      ((EA)this.id_new[id_this[38]]).id_break().forEach((var1, var2) -> ((C_case)this.id_new[id_this[102]]).id_new().id_class(var1, var2));
      ((EA)this.id_new[id_this[39]]).id_break().clear();
      if (((EA)this.id_new[id_this[40]]).id_byte().id_class()) {
         ((C_case)this.id_new[id_this[41]]).id_new().id_class();
      }

      return ((EA)this.id_new[id_this[42]]).id_byte();
   }

   public boolean id_extends() {
      return !this.id_volatile().contains(((Ps_1)this.id_new[id_this[22]]).id_volatile())
            && !this.id_volatile().contains(((BO)((C_case)this.id_new[id_this[23]]).id_this()).id_super())
         ? id_super[1]
         : id_super[0];
   }

   @Override
   public boolean id_case() {
      return (Boolean)this.id_new[id_this[76]];
   }

   private static void id_continue() {
      Object[] var0 = new Object[1];
      rpr_3[] var2 = new rpr_3[5];
      var0[0] = var2;
      id_class = var0;
   }

   @Override
   public rU_2 id_implements() {
      return (rU_2)this.id_new[id_this[62]];
   }

   private void id_new() {
      if (this.id_new == null) {
         this.id_new = new Object[id_else[4]];
         Object[] var1 = this.id_new;
      }
   }

   private static void id_package() {
      id_else = new byte[]{5, 2, 3, 4, 13};
   }

   private static void id_super() {
      id_super = new boolean[]{
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         true
      };
   }

   @Override
   public boolean id_protected() {
      return this.id_class((EA)this.id_new[id_this[60]]);
   }

   public double id_protected(EZ var1) {
      Object var6 = null;
      this.id_new[id_this[16]] = var6;
      return this.id_break(var1);
   }

   @Override
   public void id_private() {
      Object var5 = null;
      this.id_new[id_this[77]] = var5;
      Object var6 = null;
      this.id_new[id_this[78]] = var6;
      Object var7 = null;
      this.id_new[id_this[79]] = var7;
   }

   public Set<rU_2> id_volatile() {
      if ((Set)this.id_new[id_this[18]] == null) {
         Set var5 = this.id_native();
         this.id_new[id_this[19]] = var5;
         Objects.requireNonNull((Set)this.id_new[id_this[20]]);
      }

      return (Set<rU_2>)this.id_new[id_this[21]];
   }

   public abstract Set<rU_2> id_native();
}
