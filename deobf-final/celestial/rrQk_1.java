package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrQk_1 implements MinecraftAccessor {
   ;
   private static boolean[] booleans9c4062aebf3b3e0dbb68c82ac08880ac;
   public Object[] fields9c4062aebf3b3e0dbb68c82ac08880ac;
   public static Object[] staticFields9c4062aebf3b3e0dbb68c82ac08880ac;
   private static String[] strings9c4062aebf3b3e0dbb68c82ac08880ac;
   private static short[] shorts9c4062aebf3b3e0dbb68c82ac08880ac;
   private static byte[] bytes9c4062aebf3b3e0dbb68c82ac08880ac;

   public void byte_() {
      if (((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[0]).isEmpty()) {
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(rrQt_1::byte_);
      } else {
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[0]).clear();
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(rrQt_1::class_);
      }
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-14, -67, -116, 44, -60, 96, 19, 122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private rrQk_1() {
      this.throws_();
      ArrayList var7 = new ArrayList();
      this.fields9c4062aebf3b3e0dbb68c82ac08880ac[0] = var7;
      ArrayList var8 = new ArrayList();
      this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1] = var8;
      ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).add(new rrQw_1());
   }

   static {
      ntfClinit();
   }

   public boolean class_(rrQx_1 var1, boolean var2, boolean var3) {
      if (var1 != null && var1.class_() != null && var1.class_().length() <= 16) {
         boolean var4 = !((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[0]).contains(var1) ? true : booleans9c4062aebf3b3e0dbb68c82ac08880ac[2];
         if (var4) {
            if (var3) {
               ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[0]).add(0, var1);
            } else {
               ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[0]).add(var1);
            }
         }

         if (var2) {
            ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(var2x -> var2x.class_(var1, var4));
         }

         return var4;
      } else {
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(rrQt_1::break_);
         return false;
      }
   }

   public boolean class_(rrQd_1 var1) {
      if (((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[0]).stream().noneMatch(var1x -> var1x.break_().equals(var1))) {
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(var1x -> var1x.class_(var1));
         return false;
      } else {
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(var1x -> var1x.break_(var1));
         return ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[0]).removeIf(var1x -> var1x.break_().equals(var1));
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -921999316;
   }

   public void class_(rrQx_1 var1) {
      var1.byte_()
         .thenAccept(
            var1x -> {
               String var2 = "Вы успешно авторизовались в аккаунт '"
                  + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().break_(var1.class_())
                  + "'";
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Accounts", var2, 2000));
            }
         )
         .exceptionally(var0 -> {
            String var1x = "Ошибка авторизации в аккаунт";
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Accounts", var1x, 2000));
            return null;
         });
   }

   public List<rrQx_1> class_() {
      return (List<rrQx_1>)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[0];
   }

   public rrQx_1 class_(String var1) {
      return ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[0])
         .stream()
         .filter(var1x -> var1x.class_().equalsIgnoreCase(var1.toLowerCase()))
         .findFirst()
         .orElse(null);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6623718177039580363L;
   }

   public List<rrQt_1> break_() {
      return (List<rrQt_1>)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1];
   }

   public void break_(String var1) {
      rrQx_1 var2 = this.class_(var1);
      if (var2 == null) {
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(var1x -> var1x.class_(var1));
      } else {
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[1]).forEach(var3 -> var3.break_(var2, this.protected_(var1)));
         ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[0]).removeIf(var1x -> var1x.class_().equals(var1));
      }
   }

   private void throws_() {
      if (this.fields9c4062aebf3b3e0dbb68c82ac08880ac == null) {
         this.fields9c4062aebf3b3e0dbb68c82ac08880ac = new Object[2];
         Object[] var1 = this.fields9c4062aebf3b3e0dbb68c82ac08880ac;
      }
   }

   private static void catch_() {
      strings9c4062aebf3b3e0dbb68c82ac08880ac = new String[]{
         new String("Ошибка авторизации в аккаунт"), new String("Accounts"), new String("Accounts"), new String("INSTANCE")
      };
   }

   private static void extends_() {
      bytes9c4062aebf3b3e0dbb68c82ac08880ac = new byte[]{16, 2, 2};
   }

   private static void case_() {
      booleans9c4062aebf3b3e0dbb68c82ac08880ac = new boolean[]{false, true, false, false, false, true, false, false, false, true};
   }

   private static void implements_() {
      shorts9c4062aebf3b3e0dbb68c82ac08880ac = new short[]{1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 2000, 0, 0, 2000, 0};
   }

   public boolean protected_(String var1) {
      return ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[0]).stream().anyMatch(var1x -> var1x.class_().equals(var1));
   }

   public rrQx_1 protected_() {
      return ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[0])
         .stream()
         .filter(var0 -> var0.class_().equalsIgnoreCase(import_.while_().byte_().toLowerCase()))
         .findFirst()
         .orElse(null);
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrQk_1(), null};
      var0[1] = new rrQk_1[]{(rrQk_1)var0[0]};
      staticFields9c4062aebf3b3e0dbb68c82ac08880ac = var0;
   }
}
