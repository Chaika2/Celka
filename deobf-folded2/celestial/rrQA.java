package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQA extends LV<rrQn_1> {
   private static short[] id_throws;
   private static double[] id_case;
   private static byte[] id_catch;
   public Object[] id_class;
   private static boolean[] id_private;

   public rrQA(rrQC var1, QY var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.id_public();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      rrQn_1 var4 = this.id_finally();
      return (var4 == null || !var4.id_class(var1, var2, var3)) && !super.id_class(var1, var2, var3) ? id_private[4] : id_private[3];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1878677189708667783L;
   }

   public void id_class(rrQn_1 var1) {
      this.id_public();
      super.id_class(var1);
      ((rrQC)this.id_class[0]).id_byte(var1 != null ? true : id_private[2]);
   }

   public void id_class(String var1) {
      this.id_native();
      this.id_class(0.0);
      ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0])
         .id_class()
         .stream()
         .filter(var1x -> var1x.id_class().toLowerCase().contains(var1.toLowerCase()))
         .forEach(var1x -> {
            this.id_public();
            this.id_break(new rrQn_1(this, this.id_native, (rrQC)this.id_class[0], var1x));
         });
      this.id_class(this.id_this().isEmpty() ? null : this.id_byte(0));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-28, 23, 124, 2, -10, 40, 73, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_else() {
      id_case = new double[1];
   }

   private static void id_implements() {
      id_private = new boolean[]{false, true, false, true, false, true};
   }

   private static void id_return() {
      id_throws = new short[4];
   }

   private void id_public() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   @Override
   public int id_protected() {
      return super.id_protected() + 5;
   }

   private static int id_private(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1984026658;
   }

   public Optional<rrQn_1> id_private() {
      return Optional.ofNullable(this.id_finally());
   }

   private static void id_synchronized() {
      id_catch = new byte[]{30, 5};
   }

   @Override
   public int F_() {
      return super.F_() + 30;
   }
}
