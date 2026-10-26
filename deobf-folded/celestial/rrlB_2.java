package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlB_2 extends rrTF<Speed> {
   private static boolean[] id_break;
   private static float[] id_byte;
   private static byte[] id_protected;
   private static double[] id_case;
   public Object[] id_class;
   private static String[] id_catch;
   private static short[] id_private;

   private static void id_byte() {
      id_case = new double[]{0.2, 0.5, 0.2, 1.0, 1.0};
   }

   public rrlB_2(Speed var1) {
      super(var1);
      this.id_extends();
      Setting[] var10001 = new Setting[6];
      byte var10003 = id_break[0];
      rrIk_1 var6;
      rrIk_1 var10004 = var6 = new rrIk_1(id_catch[0], true).id_class(() -> var1.id_new() == this ? true : id_break[32]);
      this.id_class[id_private[0]] = var6;
      var10001[var10003] = var10004;
      rrIk_1 var7;
      var10004 = var7 = new rrIk_1(id_catch[1], true).id_class(() -> var1.id_new() == this ? true : id_break[30]);
      this.id_class[1] = var7;
      var10001[1] = var10004;
      rrIk_1 var8;
      var10004 = var8 = new rrIk_1(id_catch[2], true).id_class(() -> {
         this.id_extends();
         return var1.id_new() == this && ((rrIk_1)this.id_class[1]).id_class() ? true : id_break[28];
      });
      this.id_class[2] = var8;
      var10001[2] = var10004;
      rrIm_1 var9;
      rrIm_1 var14 = var9 = new rrIm_1(id_catch[3], 1.5F, 1.1F, 2.0F, 0.1F).id_class(() -> {
         this.id_extends();
         return var1.id_new() == this && ((rrIk_1)this.id_class[1]).id_class() && ((rrIk_1)this.id_class[2]).id_class() ? true : id_break[26];
      });
      this.id_class[3] = var9;
      var10001[3] = var14;
      rrIk_1 var10;
      var10004 = var10 = new rrIk_1(id_catch[4], true).id_class(() -> var1.id_new() == this ? true : id_break[24]);
      this.id_class[5] = var10;
      var10001[4] = var10004;
      rrIk_1 var11;
      var10004 = var11 = new rrIk_1(id_catch[5], id_break[6]).id_class(() -> var1.id_new() == this ? true : id_break[22]);
      this.id_class[4] = var11;
      var10001[5] = var10004;
      var1.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrAO var1) {
      this.id_extends();
      if ((Boolean)this.id_class[6]) {
         iB_2 var2 = this.id_break();
         if (var2 != null) {
            if (((rrIk_1)this.id_class[id_private[19]]).id_class() && ((cb_3)id_import.id_class[57]).BL()) {
               var1.id_break(true);
            }

            if (this.id_class()) {
               var1.id_class(1.0);
            }

            if (((rrIk_1)this.id_class[1]).id_class() && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[22]]).id_private().P().id_super()) {
               rjU_2 var3 = var2.Ps();
               if (((rrIk_1)this.id_class[2]).id_class()) {
                  float var4 = ((rrIm_1)this.id_class[3]).id_byte();
                  var3 = var3.id_extends();
                  rjU_2 var5 = var3.id_protected(var2.Pt());
                  var3 = var3.id_throws(var5.id_throws((double)var4, 1.0, (double)var4));
               }

               rrfj_3.id_class(var1, var3, (Float)((cb_3)id_import.id_class[57]).id_throws[15]);
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrAx_1 var1) {
      this.id_extends();
      if ((Boolean)this.id_class[6] && var1.id_class() == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[1] && this.id_break() != null) {
         var1.id_class(true);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5353216560068535656L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-81, -23, 51, -28, -107, 88, 126, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_class() {
      this.id_extends();
      return (Boolean)this.id_class[7];
   }

   @EventTarget
   public void id_class(rrLx_1 var1) {
      this.id_extends();
      if ((Boolean)this.id_class[6]
         && this.id_class()
         && this.id_break() != null
         && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[28]]).id_private().P().id_super()) {
         var1.id_break(true);
      }
   }

   @EventTarget(
      id_class = 200
   )
   public void id_class(q_1 var1) {
      this.id_extends();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[6]]) {
         Boolean var8 = this.id_case();
         this.id_class[6] = var8;
         if (!(Boolean)this.id_class[6]) {
            return;
         }

         rfl_3 var2 = ((cb_3)id_import.id_class[57]).rN().id_byte(0.2, 0.5, 0.2);
         List var3 = ((gm_3)id_import.id_class[56])
            .id_break((cb_3)id_import.id_class[57], var2, var0 -> !var0.id_native() && var0.BM() && var0.rY() ? true : id_break[20]);
         if (!var3.isEmpty()) {
            cb_3 var10000 = (cb_3)id_import.id_class[57];
            Float var9 = (Float)((cb_3)id_import.id_class[57]).id_private[29] + 0.14F;
            var10000.id_private[29] = var9;
            Boolean var10 = true;
            this.id_class[7] = var10;
         }
      } else if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1]) {
         Boolean var11 = id_break[8];
         this.id_class[7] = var11;
      }
   }

   @EventTarget
   public void id_class(rrAS var1) {
      this.id_extends();
      if ((Boolean)this.id_class[6] && this.id_break() != null) {
         var1.id_class(id_break[13]);
      }
   }

   @EventTarget
   public void id_class(rrAB var1) {
      this.id_extends();
      if ((Boolean)this.id_class[6] && this.id_class() && ((rrIk_1)this.id_class[5]).id_class()) {
         var1.id_class(true);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -70159987;
   }

   public iB_2 id_break() {
      return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[40]]).id_private().E().id_continue();
   }

   private static void id_throws() {
      id_private = new short[]{
         0, 1, 2, 3, 5, 4, 0, 6, 6, 57, 56, 57, 57, 29, 29, 7, 1, 7, 6, 0, 57, 1, 0, 2, 3, 57, 15, 6, 0, 6, 5, 6, 1, 6, 5, 57, 57, 4, 7, 6, 0, 7, 1, 2, 1
      };
   }

   private static void id_finally() {
      id_byte = new float[]{1.5F, 1.1F, 2.0F, 0.1F, 0.14F};
   }

   private void id_extends() {
      if (this.id_class == null) {
         this.id_class = new Object[8];
         this.id_class[6] = false;
         this.id_class[7] = false;
      }
   }

   private boolean id_case() {
      this.id_extends();
      if (((rrIk_1)this.id_class[5]).id_class() && ((cb_3)id_import.id_class[57]).id_return()) {
         return id_break[14];
      } else {
         rdb_3 var1 = ((cb_3)id_import.id_class[57]).ss().id_break();
         return ((rrIk_1)this.id_class[4]).id_class() && !(var1 instanceof rkx_3) && !(var1 instanceof rxM_2) ? id_break[15] : true;
      }
   }

   private static void id_implements() {
      id_catch = new String[]{
         new String("Автоматический прыжок"),
         new String("Кружить вокруг цели"),
         new String("Предикт позиции"),
         new String("Сила предикта"),
         new String("Останавливать при\nиспользовании предмета"),
         new String("Только с оружием")
      };
   }

   private static void id_protected() {
      id_protected = new byte[]{6, 2, 3, 4, 5, 8, 6, 7};
   }

   private static void id_private() {
      id_break = new boolean[]{
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false
      };
   }

   @Override
   public boolean aK_() {
      this.id_extends();
      Boolean var5 = id_break[17];
      this.id_class[7] = var5;
      Boolean var6 = id_break[18];
      this.id_class[6] = var6;
      return super.aK_();
   }
}
