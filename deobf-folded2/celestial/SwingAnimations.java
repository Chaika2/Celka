package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SwingAnimations extends Module {
   public Object[] id_break;
   private static double[] id_byte;
   private static short[] id_protected;
   private static float[] id_throws;
   private static String[] id_catch;
   private static boolean[] id_private;
   private static byte[] id_implements;

   public SwingAnimations() {
      super("Swing Animations", "Изменяет положение предметов\nв руках", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.id_new();
      rrIQ var5 = new rrIQ("Режим", "Type 1", "Type 1", "Type 2", "Default");
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Только с AttackAura", false);
      this.id_break[1] = var6;
      rrIm_1 var7 = new rrIm_1("Сила", 70.0F, 10.0F, 100.0F, 10.0F).id_class(() -> {
         this.id_new();
         return !((rrIQ)this.id_break[0]).id_byte().equals("Default") ? true : id_private[20];
      });
      this.id_break[2] = var7;
      rrIm_1 var8 = new rrIm_1("Скорость", 7.0F, 1.0F, 10.0F, 1.0F);
      this.id_break[3] = var8;
      rrIm_1 var9 = new rrIm_1("X координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.id_break[4] = var9;
      rrIm_1 var10 = new rrIm_1("Y координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.id_break[5] = var10;
      rrIm_1 var11 = new rrIm_1("Z координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.id_break[6] = var11;
      rrIm_1 var12 = new rrIm_1("X координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.id_break[7] = var12;
      rrIm_1 var13 = new rrIm_1("Y координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.id_break[8] = var13;
      rrIm_1 var14 = new rrIm_1("Z координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.id_break[9] = var14;
      this.id_class(
         new Setting[]{
            new GroupSetting("Анимация", (rrIQ)this.id_break[0], (rrIm_1)this.id_break[2], (rrIm_1)this.id_break[3]),
            new GroupSetting("Позиция правой руки", (rrIm_1)this.id_break[7], (rrIm_1)this.id_break[8], (rrIm_1)this.id_break[9]),
            new GroupSetting("Позиция левой руки", (rrIm_1)this.id_break[4], (rrIm_1)this.id_break[5], (rrIm_1)this.id_break[6]),
            new GroupSetting("Другое", (rrIk_1)this.id_break[1])
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_private = new boolean[]{
         false, true, false, false, false, true, true, false, true, false, true, true, false, true, false, true, false, true, true, true, false
      };
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2565377070511132123L;
   }

   private void id_class(Ml_1 var1, float var2, float var3) {
      this.id_new();
      float var4 = rfU_2.id_byte(var2);
      var1.id_class(rje_3.id_protected.id_byte(var3 * (45.0F + rfU_2.id_class(var2 * var2 * (float) Math.PI) / 4.0F * -20.0F)));
      var1.id_class(rje_3.id_case.id_byte(var3 * rfU_2.id_class(var4 * (float) Math.PI) * -20.0F));
      var1.id_class(rje_3.id_break.id_byte(rfU_2.id_class(var4 * (float) Math.PI) * -((rrIm_1)this.id_break[2]).id_byte()));
      var1.id_class(rje_3.id_protected.id_byte(var3 * -45.0F));
   }

   @EventTarget
   public void id_class(rrAi_1 var1) {
      this.id_new();
      if (this.id_continue()) {
         Ml_1 var2 = var1.id_break();
         rpZ_2 var3 = var1.id_class();
         float var4 = var1.id_catch();
         byte var5 = var3 == rpZ_2.RIGHT ? 1 : id_implements[11];
         switch (((int[])rrqj_3.id_class[1])[var1.id_throws().ordinal()]) {
            case 1:
               switch (((int[])rrqj_3.id_class[0])[var3.ordinal()]) {
                  case 1:
                     var2.id_class(
                        (double)((rrIm_1)this.id_break[7]).id_byte().floatValue(),
                        (double)((rrIm_1)this.id_break[8]).id_byte().floatValue(),
                        (double)((rrIm_1)this.id_break[9]).id_byte().floatValue()
                     );
                     return;
                  case 2:
                     var2.id_class(
                        (double)((rrIm_1)this.id_break[4]).id_byte().floatValue(),
                        (double)((rrIm_1)this.id_break[5]).id_byte().floatValue(),
                        (double)((rrIm_1)this.id_break[6]).id_byte().floatValue()
                     );
                     return;
                  default:
                     return;
               }
            case 2:
               if (var3 == ((Qw_1)id_import.id_class[20]).id_continue) {
                  String var6 = ((rrIQ)this.id_break[0]).id_byte();
                  switch (var6) {
                     case "Type 1":
                        this.id_class(var1, var2, var5);
                        this.id_class(var2, var4, (float)var5);
                        break;
                     case "Type 2":
                        this.id_class(var1, var2, var5);
                        this.id_break(var2, var4, (float)var5);
                  }
               }
         }
      }
   }

   private void id_class(rrAi_1 var1, Ml_1 var2, int var3) {
      var1.id_class(true);
      var2.id_class((double)((float)var3 * 0.56F), -0.52F, -0.72F);
   }

   @EventTarget
   public void id_class(rrLl_1 var1) {
      this.id_new();
      if (this.id_continue()) {
         float var2 = ((rrIm_1)this.id_break[3]).id_native() - ((rrIm_1)this.id_break[3]).id_byte() + ((rrIm_1)this.id_break[3]).id_class();
         var1.id_class(var2 * 2.0F);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 563666554;
   }

   private void id_break(Ml_1 var1, float var2, float var3) {
      this.id_new();
      var1.id_class(rje_3.id_protected.id_byte(var3 * 90.0F));
      var1.id_class(rje_3.id_case.id_byte(var3 * -60.0F));
      var1.id_class(rje_3.id_break.id_byte(-60.0F - 40.0F * (float)Math.sin((double)var2 * (Math.PI / 2) * 2.0) * ((rrIm_1)this.id_break[2]).id_byte() / 50.0F));
      var1.id_class(rje_3.id_break.id_byte(var3 * -20.0F));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, -81, 7, -85, -2, 7, 116, 78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_goto() {
      id_byte = new double[]{Math.PI / 2, 2.0, -0.52F, -0.72F};
   }

   private boolean id_continue() {
      this.id_new();
      return ((rrIk_1)this.id_break[1]).id_class() && !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().E().aJ_()
         ? false
         : id_private[17];
   }

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[10];
      }
   }

   private static void id_return() {
      id_catch = new String[]{
         new String("Swing Animations"),
         new String("Изменяет положение предметов\nв руках"),
         new String("Режим"),
         new String("Type 1"),
         new String("Type 1"),
         new String("Type 2"),
         new String("Default"),
         new String("Только с AttackAura"),
         new String("Сила"),
         new String("Скорость"),
         new String("X координата"),
         new String("Y координата"),
         new String("Z координата"),
         new String("X координата"),
         new String("Y координата"),
         new String("Z координата"),
         new String("Анимация"),
         new String("Позиция правой руки"),
         new String("Позиция левой руки"),
         new String("Другое"),
         new String("Type 1"),
         new String("Type 2"),
         new String("Default")
      };
   }

   private static void id_super() {
      id_protected = new short[]{2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 7, 8, 9, 4, 5, 6, 1, 1, 0, 7, 8, 9, 4, 5, 6, 20, 0, 3, 3, 3, 1, 0, 2, 2, 0};
   }

   private static void id_while() {
      id_throws = new float[]{
         70.0F,
         10.0F,
         100.0F,
         10.0F,
         7.0F,
         1.0F,
         10.0F,
         1.0F,
         0.0F,
         -1.5F,
         1.5F,
         0.1F,
         0.0F,
         -1.5F,
         1.5F,
         0.1F,
         0.0F,
         -1.5F,
         1.5F,
         0.1F,
         0.0F,
         -1.5F,
         1.5F,
         0.1F,
         0.0F,
         -1.5F,
         1.5F,
         0.1F,
         0.0F,
         -1.5F,
         1.5F,
         0.1F,
         2.0F,
         45.0F,
         (float) Math.PI,
         4.0F,
         -20.0F,
         (float) Math.PI,
         -20.0F,
         (float) Math.PI,
         -45.0F,
         90.0F,
         -60.0F,
         -60.0F,
         40.0F,
         50.0F,
         -20.0F,
         0.56F
      };
   }

   private static void id_public() {
      id_implements = new byte[]{3, 2, 4, 3, 2, 3, 2, 2, 3, 2, 3, -1, -1, 10};
   }
}
