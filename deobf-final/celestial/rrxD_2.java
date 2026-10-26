package celestial;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import org.lwjgl.BufferUtils;

public class rrxD_2 {
   private String class_;
   private IntBuffer break_;
   private IntBuffer byte_;
   private boolean[] protected_;
   private boolean[] throws_;

   public int byte_() {
      return this.break_.limit();
   }

   public int byte_(int var1) {
      return this.class_(var1, this.protected_[var1]);
   }

   public rrxD_2(String var1, int var2) {
      this.class_ = var1;
      this.break_ = BufferUtils.createIntBuffer(var2);
      this.byte_ = BufferUtils.createIntBuffer(var2);
      this.protected_ = new boolean[var2];
      this.throws_ = new boolean[var2];
   }

   @Override
   public String toString() {
      return this.class_
         + ", A: "
         + rrWs_1.class_(this.break_)
         + ", B: "
         + rrWs_1.class_(this.byte_)
         + ", flips: ["
         + rrki_1.class_(this.protected_, this.byte_())
         + "], changed: ["
         + rrki_1.class_(this.throws_, this.byte_())
         + "]";
   }

   private int class_(int var1, boolean var2) {
      IntBuffer var3 = var2 ? this.byte_ : this.break_;
      return var3.get(var1);
   }

   public int class_() {
      return this.break_.capacity();
   }

   public int class_(boolean var1, int var2) {
      return var1 ? this.byte_(var2) : this.protected_(var2);
   }

   public rrxD_2 class_(int var1) {
      ((Buffer)this.break_).position(var1);
      ((Buffer)this.byte_).position(var1);
      return this;
   }

   public int break_() {
      return this.break_.position();
   }

   public rrxD_2 break_(int var1) {
      ((Buffer)this.break_).limit(var1);
      ((Buffer)this.byte_).limit(var1);
      return this;
   }

   public void throws_(int var1) {
      this.protected_[var1] = !this.protected_[var1];
      this.throws_[var1] = true;
   }

   public void throws_() {
      MT.class_(this.break_);
      MT.class_(this.byte_);
   }

   public void catch_(int var1) {
      int var2 = this.byte_();

      for (int var3 = 0; var3 < var2; var3++) {
         this.break_.put(var3, var1);
         this.byte_.put(var3, var1);
      }
   }

   public rrxD_2 catch_() {
      this.class_(0);
      this.break_(this.class_());
      return this;
   }

   public void case_() {
      MT.break_(this.break_);
      MT.break_(this.byte_);
      this.protected_();
   }

   public boolean case_(int var1) {
      return this.throws_[var1];
   }

   public int protected_(int var1) {
      return this.class_(var1, !this.protected_[var1]);
   }

   public void protected_() {
      Arrays.fill(this.protected_, false);
      Arrays.fill(this.throws_, false);
   }
}
