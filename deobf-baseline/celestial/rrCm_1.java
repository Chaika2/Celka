package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrCm_1 extends rrCv_1 {
   private static byte[] id_byte;
   public static Object[] id_class;
   private static boolean[] id_protected;
   private static String[] id_case;
   private static short[] id_catch;
   public Object[] id_break;

   private static void id_byte() {
      id_case = new String[]{new String("Активация"), new String("Зачар. золотое яблоко")};
   }

   public rrCm_1(FastSwap var1) {
      super(var1);
      this.id_case();
      rrIF var6 = new rrIF(id_case[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_catch[0]]);
      this.id_break[id_catch[1]] = var6;
      rrmi_3 var7 = new rrmi_3();
      this.id_break[id_catch[2]] = var7;
      rrmi_3 var8 = new rrmi_3();
      this.id_break[id_catch[3]] = var8;
      Setting[] var10001 = new Setting[id_protected[0]];
      byte var10003 = id_protected[1];
      String var10006 = id_case[1];
      Setting[] var10007 = new Setting[id_protected[2]];
      var10007[id_protected[3]] = (rrIF)this.id_break[id_catch[4]];
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var1.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private void id_class(int var1, int var2) {
      if (var1 > id_byte[4]) {
         ((Ax_1)id_import.id_class[id_catch[25]])
            .id_class(((rJr_1)((cb_3)id_import.id_class[id_catch[26]]).id_implements[id_catch[27]]).id_case, var1, var2, rXa_1.SWAP, id_protected[12]);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[28]]).id_finally().id_class(rrLY.id_class());
      } else {
         ((rhz_3)((cb_3)id_import.id_class[id_catch[29]]).id_implements[id_catch[30]]).id_protected = var1;
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_case();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[7]] && (Boolean)this.id_break[id_catch[8]]) {
         Pair var2 = this.id_implements();
         rdn_3 var3 = (rdn_3)var2.getLeft();
         int var4 = (Integer)var2.getRight();
         int var5 = ((rrmi_3)this.id_break[id_catch[9]]).id_class(id_protected[5]);
         if (var5 != id_byte[0] && var5 < id_byte[1]) {
            int var14 = ((rrmi_3)this.id_break[id_catch[10]]).id_break();
            this.id_class(var14, var5);
            ((rrmi_3)this.id_break[id_catch[11]]).id_throws();
         } else if (var4 >= 0) {
            boolean var6 = var4 > id_byte[2] ? id_protected[7] : id_protected[8];
            int var7 = ((rhz_3)((cb_3)id_import.id_class[id_catch[12]]).id_implements[id_catch[13]]).id_protected;
            if (var6 && !((rrmi_3)this.id_break[id_catch[14]]).id_class()) {
               ((rrmi_3)this.id_break[id_catch[15]]).id_class(((cb_3)id_import.id_class[id_catch[16]]).ss(), var7);
            }

            this.id_class(var4, var7);
            if (var6) {
               ((rrmi_3)this.id_break[id_catch[17]]).id_class(var3, var4);
            }
         } else if (((rrmi_3)this.id_break[id_catch[18]]).id_class() && ((rrmi_3)this.id_break[id_catch[19]]).id_class()) {
            int var13 = ((rrmi_3)this.id_break[id_catch[20]]).id_class(id_protected[9]);
            if (var13 != id_byte[3]) {
               this.id_class(((rrmi_3)this.id_break[id_catch[21]]).id_break(), ((rrmi_3)this.id_break[id_catch[22]]).id_break());
            }

            ((rrmi_3)this.id_break[id_catch[23]]).id_throws();
         }

         Boolean var12 = id_protected[11];
         this.id_break[id_catch[24]] = var12;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5270965237423129975L;
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_case();
      if (var1.id_break() == ((rrIF)this.id_break[id_catch[5]]).id_finally().id_byte()) {
         Boolean var6 = id_protected[4];
         this.id_break[id_catch[6]] = var6;
      }
   }

   @Override
   public rdb_3 id_class() {
      return rdy_3.hp;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{98, -71, -78, 60, -38, -74, -44, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 312558797;
   }

   @Override
   public Predicate<rdn_3> id_break() {
      return var1 -> var1.id_break() == this.id_class() ? id_protected[16] : id_protected[17];
   }

   private static void id_throws() {
      id_byte = new byte[]{-1, 9, 8, -1, 8, -1, -2, -3, 45, -1, 4, 3};
   }

   private static void id_finally() {
      id_catch = new short[]{0, 0, 1, 2, 0, 0, 3, 0, 3, 1, 1, 1, 57, 1, 2, 2, 57, 1, 2, 1, 2, 1, 2, 2, 3, 55, 57, 4, 0, 57, 1, 57, 57, 57, 1, 3, 1, 2, 0};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
         this.id_break[3] = false;
      }
   }

   private Pair<rdn_3, Integer> id_implements() {
      Predicate var1 = this.id_break();
      if (var1 == null) {
         return Pair.of(null, Integer.valueOf(id_byte[5]));
      } else if (var1.test(((cb_3)id_import.id_class[id_catch[31]]).ss())) {
         return Pair.of(null, Integer.valueOf(id_byte[6]));
      } else if (var1.test(((cb_3)id_import.id_class[id_catch[32]]).Sn())) {
         return Pair.of(null, Integer.valueOf(id_byte[7]));
      } else {
         ArrayList var2 = new ArrayList();

         for (int var3 = id_protected[13]; var3 < id_byte[8]; var3++) {
            rdn_3 var4 = ((rhz_3)((cb_3)id_import.id_class[id_catch[33]]).id_implements[id_catch[34]]).id_extends(var3);
            if (var1.test(var4)) {
               var2.add(Pair.of(var4, var3));
            }
         }

         if (var2.isEmpty()) {
            return Pair.of(null, Integer.valueOf(id_byte[9]));
         } else {
            var2.sort((var0, var1x) -> ((rrCZ)id_class[id_catch[38]]).id_class((rdn_3)var0.getLeft(), (rdn_3)var1x.getLeft()));
            return (Pair<rdn_3, Integer>)var2.get(id_protected[14]);
         }
      }
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrCZ()};
      id_class = var0;
   }

   private static void id_private() {
      id_protected = new boolean[]{
         true, false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, true
      };
   }

   @Override
   public boolean aK_() {
      this.id_case();
      Boolean var5 = id_protected[15];
      this.id_break[id_catch[35]] = var5;
      ((rrmi_3)this.id_break[id_catch[36]]).id_throws();
      ((rrmi_3)this.id_break[id_catch[37]]).id_throws();
      return super.aK_();
   }
}
