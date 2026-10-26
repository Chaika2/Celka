package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CheckGroup {
   public Object[] class_;
   private static short[] break_;
   private static boolean[] byte_;

   public List<rrIk_1> byte_() {
      return new ArrayList<>(((Map)this.class_[0]).values());
   }

   public CheckGroup byte_(boolean var1) {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[3], var1);
   }

   public CheckGroup() {
      this.native_();
      EnumMap var5 = new EnumMap<>(rrIA.class);
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-71, -66, -93, -30, -33, 88, 117, -81}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public CheckGroup class_(rrIA var1, boolean var2) {
      rrIk_1 var3 = new rrIk_1(var1.class_(), var1.break_());
      var3.class_(Boolean.valueOf(var2), false, true);
      if (var1 == (rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[1]) {
         var3.class_(this::throws_);
      }

      ((Map)this.class_[0]).put(var1, var3);
      return this;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 270219163;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8776221014330812434L;
   }

   private boolean class_(rrIA var1) {
      return Optional.ofNullable((rrIk_1)((Map)this.class_[0]).get(var1)).map(rrIk_1::class_).orElse(false);
   }

   public CheckGroup class_(boolean var1) {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[5], var1);
   }

   public boolean class_() {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[6]);
   }

   public boolean break_() {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[3]);
   }

   public CheckGroup break_(boolean var1) {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[6], var1);
   }

   public CheckGroup throws_(boolean var1) {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[2], var1);
   }

   public boolean throws_() {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[0]);
   }

   public boolean finally_() {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[1]);
   }

   public boolean catch_() {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[5]);
   }

   public CheckGroup catch_(boolean var1) {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[0], var1);
   }

   public boolean extends_() {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[8]);
   }

   public boolean case_() {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[4]);
   }

   public CheckGroup case_(boolean var1) {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[1], var1);
   }

   public CheckGroup implements_(boolean var1) {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[4], var1);
   }

   public boolean implements_() {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[2]);
   }

   public CheckGroup protected_(boolean var1) {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[7], var1);
   }

   public Map<rrIA, rrIk_1> protected_() {
      return (Map<rrIA, rrIk_1>)this.class_[0];
   }

   public CheckGroup private_(boolean var1) {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[8], var1);
   }

   public boolean private_() {
      return this.class_((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[7]);
   }

   private static void final_() {
      byte_ = new boolean[]{false, true, false, true};
   }

   private static void volatile_() {
      break_ = new short[]{0, 0, 1, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0};
   }

   private void native_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
