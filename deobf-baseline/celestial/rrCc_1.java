package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrCc_1 extends rrCv_1 {
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static byte[] id_case;
   public Object[] id_class;
   private static String[] id_catch;
   public static Object[] id_break;

   private static void id_byte() {
      id_case = new byte[]{2, -1, 9, 8, -1, 8, -1, -2, -3, 45, -1, 5, 4};
   }

   public rrCc_1(FastSwap var1) {
      super(var1);
      this.id_protected();
      rrIF var6 = new rrIF(id_catch[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_protected[0]]);
      this.id_class[id_protected[1]] = var6;
      rrIk_1 var7 = new rrIk_1(id_catch[1], id_byte[0]);
      this.id_class[id_protected[2]] = var7;
      rrmi_3 var8 = new rrmi_3();
      this.id_class[id_protected[3]] = var8;
      rrmi_3 var9 = new rrmi_3();
      this.id_class[id_protected[4]] = var9;
      Setting[] var10001 = new Setting[id_byte[1]];
      byte var10003 = id_byte[2];
      String var10006 = id_catch[2];
      Setting[] var10007 = new Setting[id_case[0]];
      var10007[id_byte[3]] = (rrIF)this.id_class[id_protected[5]];
      var10007[id_byte[4]] = (rrIk_1)this.id_class[id_protected[6]];
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var1.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6330272415605383401L;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_protected();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[9]] && (Boolean)this.id_class[id_protected[10]]) {
         Pair var2 = this.id_throws();
         rdn_3 var3 = (rdn_3)var2.getLeft();
         int var4 = (Integer)var2.getRight();
         int var5 = ((rrmi_3)this.id_class[id_protected[11]]).id_class(id_byte[6]);
         if (var5 != id_case[1] && var5 < id_case[2]) {
            int var14 = ((rrmi_3)this.id_class[id_protected[12]]).id_break();
            this.id_class(var14, var5);
            ((rrmi_3)this.id_class[id_protected[13]]).id_throws();
         } else if (var4 >= 0) {
            boolean var6 = var4 > id_case[3] ? id_byte[8] : id_byte[9];
            int var7 = ((rhz_3)((cb_3)id_import.id_class[id_protected[14]]).id_implements[id_protected[15]]).id_protected;
            if (var6 && !((rrmi_3)this.id_class[id_protected[16]]).id_class()) {
               ((rrmi_3)this.id_class[id_protected[17]]).id_class(((cb_3)id_import.id_class[id_protected[18]]).ss(), var7);
            }

            this.id_class(var4, var7);
            if (var6) {
               ((rrmi_3)this.id_class[id_protected[19]]).id_class(var3, var4);
            }
         } else if (((rrmi_3)this.id_class[id_protected[20]]).id_class() && ((rrmi_3)this.id_class[id_protected[21]]).id_class()) {
            int var13 = ((rrmi_3)this.id_class[id_protected[22]]).id_class(id_byte[10]);
            if (var13 != id_case[4]) {
               this.id_class(((rrmi_3)this.id_class[id_protected[23]]).id_break(), ((rrmi_3)this.id_class[id_protected[24]]).id_break());
            }

            ((rrmi_3)this.id_class[id_protected[25]]).id_throws();
         }

         Boolean var12 = id_byte[12];
         this.id_class[id_protected[26]] = var12;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -829906179;
   }

   private void id_class(int var1, int var2) {
      if (var1 > id_case[5]) {
         ((Ax_1)id_import.id_class[id_protected[27]])
            .id_class(((rJr_1)((cb_3)id_import.id_class[id_protected[28]]).id_implements[id_protected[29]]).id_case, var1, var2, rXa_1.SWAP, id_byte[13]);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[30]]).id_finally().id_class(rrLY.id_class());
      } else {
         ((rhz_3)((cb_3)id_import.id_class[id_protected[31]]).id_implements[id_protected[32]]).id_protected = var1;
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-32, 102, 38, 70, 57, -17, -81, 8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rdb_3 id_class() {
      return rdy_3.kU;
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_protected();
      if (var1.id_break() == ((rrIF)this.id_class[id_protected[7]]).id_finally().id_byte()) {
         Boolean var6 = id_byte[5];
         this.id_class[id_protected[8]] = var6;
      }
   }

   @Override
   public Predicate<rdn_3> id_break() {
      return var1 -> {
         this.id_protected();
         if (var1.id_break() == this.id_class()) {
            return ((rrIk_1)this.id_class[id_protected[40]]).id_class() ? var1.id_protected(id_catch[3]) : id_byte[17];
         } else {
            return id_byte[18];
         }
      };
   }

   private Pair<rdn_3, Integer> id_throws() {
      Predicate var1 = this.id_break();
      if (var1 == null) {
         return Pair.of(null, Integer.valueOf(id_case[6]));
      } else if (var1.test(((cb_3)id_import.id_class[id_protected[33]]).ss())) {
         return Pair.of(null, Integer.valueOf(id_case[7]));
      } else if (var1.test(((cb_3)id_import.id_class[id_protected[34]]).Sn())) {
         return Pair.of(null, Integer.valueOf(id_case[8]));
      } else {
         ArrayList var2 = new ArrayList();

         for (int var3 = id_byte[14]; var3 < id_case[9]; var3++) {
            rdn_3 var4 = ((rhz_3)((cb_3)id_import.id_class[id_protected[35]]).id_implements[id_protected[36]]).id_extends(var3);
            if (var1.test(var4)) {
               var2.add(Pair.of(var4, var3));
            }
         }

         if (var2.isEmpty()) {
            return Pair.of(null, Integer.valueOf(id_case[10]));
         } else {
            var2.sort((var0, var1x) -> ((rrCu_1)id_break[id_protected[41]]).id_class((rdn_3)var0.getLeft(), (rdn_3)var1x.getLeft()));
            return (Pair<rdn_3, Integer>)var2.get(id_byte[15]);
         }
      }
   }

   private static void id_finally() {
      id_catch = new String[]{new String("Активация"), new String("Только крушителя"), new String("Арбалет"), new String("don-item")};
   }

   private static void id_case() {
      id_protected = new short[]{
         0, 0, 1, 2, 3, 0, 1, 0, 4, 0, 4, 2, 2, 2, 57, 1, 3, 3, 57, 2, 3, 2, 3, 2, 3, 3, 4, 55, 57, 4, 0, 57, 1, 57, 57, 57, 1, 4, 2, 3, 1, 0
      };
   }

   private static void id_implements() {
      id_byte = new boolean[]{
         false, true, false, false, true, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, true
      };
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         this.id_class[4] = false;
      }
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrCu_1()};
      id_break = var0;
   }

   @Override
   public boolean aK_() {
      this.id_protected();
      Boolean var5 = id_byte[16];
      this.id_class[id_protected[37]] = var5;
      ((rrmi_3)this.id_class[id_protected[38]]).id_throws();
      ((rrmi_3)this.id_class[id_protected[39]]).id_throws();
      return super.aK_();
   }
}
