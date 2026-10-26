package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EventParser extends Module implements rrja_3 {
   private static boolean[] byte_;
   private static long[] protected_;
   private static byte[] throws_;
   private static float[] catch_;
   public Object[] break_;
   private static String[] private_;
   private static short[] implements_;

   private void byte_(rrjD_2 var1, boolean var2) {
      this.while_();
      boolean var3 = ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).class_(var1, var2);
      if (var3) {
         ((Map)this.break_[0]).put(var1.byte_(), rqR_2.break_());
      }
   }

   public EventParser() {
      super("Event Parser", "Отслеживает появление событий\nи устанавливает путь к ним", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.while_();
      ConcurrentHashMap var5 = new ConcurrentHashMap();
      this.break_[0] = var5;
      rrIQ var6 = new rrIQ("Режим", "Автоматический", "Автоматический", "Ручной");
      this.break_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Автоматически удалять\nточку через время", true).class_("auto_remove", (var1, var2) -> {
         this.while_();
         ((Map)this.break_[0]).clear();
      });
      this.break_[2] = var7;
      rrIm_1 var8 = new rrIm_1("Минут для удаления", 10.0F, 1.0F, 30.0F, 1.0F).class_(() -> {
         this.while_();
         return ((rrIk_1)this.break_[2]).class_();
      });
      this.break_[3] = var8;
      this.class_(new Setting[]{(rrIQ)this.break_[1], (rrIk_1)this.break_[2], (rrIm_1)this.break_[3]});
      ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).class_(this);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new long[]{1000L};
   }

   @Override
   public void class_(rrjD_2 var1, boolean var2) {
      this.while_();
      if (var2) {
         ((Map)this.break_[0]).remove(var1.byte_());
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1013792026;
   }

   private void class_(Bt_1 var1) {
      if (var1 instanceof Bn_1 var2) {
         String var3 = var2.throws_();
         String var4 = var2.protected_();
         Aw_1 var5 = var2.byte_();
         rja_3 var6 = var2.e_();
         rrjD_2 var7 = new rrjD_2(var3, var6.else_(), rrfp_3.throws_());
         if (this.continue_()) {
            this.byte_(var7, true);
         } else if (this.new_()) {
            rgN_2 var8 = new rgN_2("Событие: " + rgF_2.RED + var4);
            if (var2 instanceof By_1 var9) {
               String var10 = var9.class_();
               if (var10 != null) {
                  var8.break_("\nУровень лута: " + rgF_2.RED + var10);
               }
            }

            if (var5 != null) {
               var8.break_("\nПризвал: " + rgF_2.RED + var5.class_().getName());
            }

            var8.break_("\nКоординаты: " + rgF_2.RED + var6.b_() + " " + var6.c_() + " " + var6.d_());
            rVi_1 var11 = rgv_3.class_(
               new rgN_2("Нажмите, чтобы добавить путь к событию " + rgF_2.RED + "'" + var3 + "'"),
               new rgy_3(rgp_3.class_, var8),
               new rgl_3(() -> this.byte_(var7.class_(), true))
            );
            rrfu_3.class_(var11.break_(rgF_2.GRAY));
         }
      } else {
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
            .class_(new rrtd_3(this.final_(), "Добавлено новое событие '" + var1.throws_() + "'", 5000));
      }

      MinecraftAccessor.a_(rrfu_3.class_((Module)this) + "Добавлено новое событие '" + var1.throws_() + "'", false);
   }

   @EventTarget
   public void class_(Bp_1 var1) {
      Bt_1 var2 = var1.break_();
      if (var2 != null) {
         switch (((int[])rrHj_1.class_[0])[var1.class_().ordinal()]) {
            case 1:
               this.class_(var2);
               break;
            case 2:
               this.break_(var2);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2001495852254837809L;
   }

   @EventTarget
   public void class_(j_1 var1) {
      this.while_();
      if (((rrIk_1)this.break_[2]).class_() && !((Map)this.break_[0]).isEmpty()) {
         int var2 = ((rrIm_1)this.break_[3]).byte_().intValue();
         long var3 = rqR_2.break_();
         long var5 = (long)(var2 * 60) * 1000L;
         ((Map)this.break_[0]).entrySet().removeIf(var4 -> {
            long var5x = var3 - (Long)var4.getValue();
            if (var5x >= var5) {
               ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).break_((String)var4.getKey(), true);
               return true;
            } else {
               return byte_[11];
            }
         });
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{22, -43, 72, -110, 89, -70, -40, 99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_(Bt_1 var1) {
      ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).break_(var1.throws_(), true);
   }

   @Override
   public void throws_(boolean var1) {
      this.while_();
      super.throws_(var1);
      ((Map)this.break_[0]).clear();
   }

   private static void goto_() {
      catch_ = new float[]{10.0F, 1.0F, 30.0F, 1.0F};
   }

   public boolean continue_() {
      this.while_();
      return ((rrIQ)this.break_[1]).byte_().equals("Автоматический");
   }

   private static void else_() {
      private_ = new String[]{
         new String("Event Parser"),
         new String("Отслеживает появление событий\nи устанавливает путь к ним"),
         new String("Режим"),
         new String("Автоматический"),
         new String("Автоматический"),
         new String("Ручной"),
         new String("Автоматически удалять\nточку через время"),
         new String("auto_remove"),
         new String("Минут для удаления"),
         new String("Автоматический"),
         new String("Ручной")
      };
   }

   public boolean new_() {
      this.while_();
      return ((rrIQ)this.break_[1]).byte_().equals("Ручной");
   }

   private static void return_() {
      byte_ = new boolean[]{false, true, true, false, true, true, false, true, true, true, true, false};
   }

   @Override
   public void super_() {
      this.while_();
      ((Map)this.break_[0]).clear();
   }

   private static void try_() {
      implements_ = new short[]{4, 0, 1, 2, 3, 1, 2, 3, 0, 0, 2, 0, 3, 0, 0, 0, 0, 0, 5000, 0, 0, 0, 1, 1, 0, 2, 0};
   }

   private void while_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
      }
   }

   private static void public_() {
      throws_ = new byte[]{2, 3, 2, 60, 4};
   }
}
