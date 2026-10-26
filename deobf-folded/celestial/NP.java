package celestial;

import java.nio.ByteBuffer;
import java.util.OptionalInt;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.openal.AL10;

public class NP {
   private ByteBuffer id_class;
   private final AudioFormat id_break;
   private boolean id_byte;
   private int id_protected;

   public OptionalInt id_byte() {
      OptionalInt var1 = this.id_class();
      this.id_byte = false;
      return var1;
   }

   public NP(ByteBuffer var1, AudioFormat var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   OptionalInt id_class() {
      if (!this.id_byte) {
         if (this.id_class == null) {
            return OptionalInt.empty();
         }

         int var1 = Nr_1.id_class(this.id_break);
         int[] var2 = new int[1];
         AL10.alGenBuffers(var2);
         if (Nr_1.id_class("Creating buffer")) {
            return OptionalInt.empty();
         }

         AL10.alBufferData(var2[0], var1, this.id_class, (int)this.id_break.getSampleRate());
         if (Nr_1.id_class("Assigning buffer data")) {
            return OptionalInt.empty();
         }

         this.id_protected = var2[0];
         this.id_byte = true;
         this.id_class = null;
      }

      return OptionalInt.of(this.id_protected);
   }

   public void id_break() {
      if (this.id_byte) {
         AL10.alDeleteBuffers(new int[]{this.id_protected});
         if (Nr_1.id_class("Deleting stream buffers")) {
            return;
         }
      }

      this.id_byte = false;
   }
}
