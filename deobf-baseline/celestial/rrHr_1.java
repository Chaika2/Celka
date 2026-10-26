package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHr_1 extends rrli_3 {
   private static byte[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         this.id_class[1] = false;
         this.id_class[2] = 0;
         this.id_class[3] = 0;
         this.id_class[4] = false;
         this.id_class[5] = false;
      }
   }

   public rrHr_1(GuiMove var1) {
      super(var1);
      this.id_byte();
      ArrayList var6 = new ArrayList();
      this.id_class[id_byte[0]] = var6;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6767043204642929827L;
   }

   @EventTarget
   public void id_class(rrAO var1) {
      this.id_byte();
      if ((Boolean)this.id_class[id_byte[17]] && C_throws.id_byte().id_return().id_class() && var1.id_private()) {
         this.id_case();
         this.id_class(id_protected[8]);
         Boolean var6 = id_protected[9];
         this.id_class[id_byte[18]] = var6;
      }
   }

   private void id_class(boolean var1) {
      this.id_byte();
      if (C_throws.id_byte().id_return().id_class()) {
         Boolean var6 = id_protected[24];
         this.id_class[id_byte[50]] = var6;
         if (var1) {
            ((Aq_1)((cb_3)id_import.id_class[id_byte[51]]).id_break[id_byte[52]]).id_break(new rmj_3(id_protected[25]));
         } else {
            ((cb_3)id_import.id_class[id_byte[53]]).id_strictfp();
         }

         Boolean var7 = id_protected[26];
         this.id_class[id_byte[54]] = var7;
      }
   }

   public boolean id_class() {
      this.id_byte();
      return !this.id_class[id_byte[55]] && ((List)this.id_class[id_byte[56]]).isEmpty() ? id_protected[27] : id_protected[28];
   }

   @EventTarget
   public void id_class(rrLY var1) {
      this.id_byte();
      if (!((List)this.id_class[id_byte[15]]).isEmpty()) {
         Boolean var6 = id_protected[7];
         this.id_class[id_byte[16]] = var6;
      }
   }

   @EventTarget(
      id_class = -200
   )
   public void id_class(q_1 var1) {
      this.id_byte();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[1]]) {
         if ((Integer)this.id_class[id_byte[2]] > 0) {
            Integer var6 = (Integer)this.id_class[id_byte[3]] - id_protected[0];
            this.id_class[id_byte[4]] = var6;
         }

         if (rrfj_3.id_catch()) {
            Integer var7 = Integer.valueOf(id_break[0]);
            this.id_class[id_byte[5]] = var7;
         }

         if ((Boolean)this.id_class[id_byte[6]]) {
            ((cb_3)id_import.id_class[id_byte[7]]).c_(id_protected[1]);
            C_throws.id_byte().id_int().id_class();
            ((rqr_3)((cb_3)id_import.id_class[id_byte[8]]).id_break[id_byte[9]]).id_break(id_protected[2]);
            int var10002 = (Integer)this.id_class[id_byte[10]] + id_protected[3];
            Integer var8 = var10002;
            this.id_class[id_byte[11]] = var8;
            if (var10002 > id_protected[4] && !((cb_3)id_import.id_class[id_byte[12]]).X()) {
               this.id_throws();
               Integer var9 = Integer.valueOf(id_protected[5]);
               this.id_class[id_byte[13]] = var9;
               Boolean var10 = id_protected[6];
               this.id_class[id_byte[14]] = var10;
            }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2099853627;
   }

   @EventTarget
   public void id_class(rrLZ var1) {
      this.id_byte();
      ruS_2 var2 = var1.id_class();
      if (var2 instanceof rmt_3 var3) {
         rrHP var5 = this.id_break(var3.id_break());
         if (var5 == (rrHP)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[id_byte[19]]) {
            ((List)this.id_class[id_byte[20]]).add(var3);
            var1.id_class(id_protected[10]);
         } else {
            if (var5 == (rrHP)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[id_byte[21]]) {
               Boolean var10 = id_protected[11];
               this.id_class[id_byte[22]] = var10;
            }

            if (!((List)this.id_class[id_byte[23]]).isEmpty()) {
               this.id_throws();
            }
         }
      } else if (var2 instanceof rmj_3 var4 && !(Boolean)this.id_class[id_byte[24]]) {
         rrHP var12 = this.id_break(var4.id_break());
         if (var12 == (rrHP)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[id_byte[25]]) {
            ((List)this.id_class[id_byte[26]]).add(var2);
            Boolean var11 = id_protected[12];
            this.id_class[id_byte[27]] = var11;
            var1.id_class(id_protected[13]);
         }
      }
   }

   @Override
   public boolean id_class(vm_3 var1) {
      if (super.id_class(var1)) {
         return id_protected[14];
      } else {
         return (rrfq_3)rrfp_3.id_class[id_byte[28]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_byte[29]] && rrfo_3.id_class()
            ? id_protected[15]
            : id_protected[16];
      }
   }

   private static void id_break() {
      id_break = new byte[]{3, -1, 6, 2, 3, 4, 5};
   }

   private rrHP id_break(int var1) {
      this.id_byte();
      if (var1 != 0) {
         return (rrHP)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[id_byte[34]];
      } else {
         return this.id_class[id_byte[35]] == 0 && ((List)this.id_class[id_byte[36]]).isEmpty()
            ? (rrHP)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[id_byte[37]]
            : (rrHP)rrHP.staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[id_byte[38]];
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{66, -43, 14, -50, 97, -35, -103, 6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_throws() {
      this.id_byte();
      if (!((List)this.id_class[id_byte[39]]).isEmpty()) {
         for (ruS_2 var2 : (List)this.id_class[id_byte[40]]) {
            ((Aq_1)((cb_3)id_import.id_class[id_byte[41]]).id_break[id_byte[42]]).id_break(var2);
         }

         ((List)this.id_class[id_byte[43]]).clear();
         this.id_class(id_protected[21]);
      }
   }

   private void id_case() {
      rdn_3 var1 = ((rhz_3)((cb_3)id_import.id_class[id_byte[44]]).id_implements[id_byte[45]]).id_finally();
      if (!var1.id_class()) {
         int var2 = rrfY_2.id_class();
         if (var2 != id_break[1]) {
            ((Ax_1)id_import.id_class[id_byte[46]])
               .id_class(
                  ((rJr_1)((cb_3)id_import.id_class[id_byte[47]]).id_implements[id_byte[48]]).id_case,
                  rrfY_2.id_break(var2),
                  id_protected[22],
                  rXa_1.PICKUP,
                  id_protected[23]
               );
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[49]]).id_finally().id_class(rrLY.id_class());
         }
      }
   }

   private static void id_protected() {
      id_byte = new short[]{
         0,
         0,
         3,
         3,
         3,
         3,
         1,
         57,
         57,
         17,
         2,
         2,
         57,
         2,
         1,
         0,
         1,
         4,
         4,
         2,
         0,
         1,
         4,
         0,
         5,
         2,
         0,
         1,
         1,
         4,
         1,
         4,
         2,
         3,
         0,
         3,
         0,
         1,
         2,
         0,
         0,
         57,
         0,
         0,
         57,
         1,
         55,
         57,
         4,
         0,
         5,
         57,
         0,
         57,
         5,
         1,
         0
      };
   }

   private static void id_private() {
      id_protected = new boolean[]{
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false
      };
   }

   @Override
   public boolean aK_() {
      this.id_byte();
      this.id_throws();
      Boolean var5 = id_protected[17];
      this.id_class[id_byte[30]] = var5;
      Boolean var6 = id_protected[18];
      this.id_class[id_byte[31]] = var6;
      Integer var7 = Integer.valueOf(id_protected[19]);
      this.id_class[id_byte[32]] = var7;
      Integer var8 = Integer.valueOf(id_protected[20]);
      this.id_class[id_byte[33]] = var8;
      return super.aK_();
   }
}
