package celestial;

import java.nio.ByteBuffer;
import java.util.OptionalInt;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.openal.AL10;

public class NP {
   private ByteBuffer class_;
   private final AudioFormat break_;
   private boolean byte_;
   private int protected_;

   public OptionalInt byte_() {
      OptionalInt var1 = this.class_();
      this.byte_ = false;
      return var1;
   }

   public NP(ByteBuffer var1, AudioFormat var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   OptionalInt class_() {
      if (!this.byte_) {
         if (this.class_ == null) {
            return OptionalInt.empty();
         }

         int var1 = Nr_1.class_(this.break_);
         int[] var2 = new int[1];
         AL10.alGenBuffers(var2);
         if (Nr_1.class_("Creating buffer")) {
            return OptionalInt.empty();
         }

         AL10.alBufferData(var2[0], var1, this.class_, (int)this.break_.getSampleRate());
         if (Nr_1.class_("Assigning buffer data")) {
            return OptionalInt.empty();
         }

         this.protected_ = var2[0];
         this.byte_ = true;
         this.class_ = null;
      }

      return OptionalInt.of(this.protected_);
   }

   public void break_() {
      if (this.byte_) {
         AL10.alDeleteBuffers(new int[]{this.protected_});
         if (Nr_1.class_("Deleting stream buffers")) {
            return;
         }
      }

      this.byte_ = false;
   }
}
