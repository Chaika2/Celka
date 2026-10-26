package celestial;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;

public interface Nz_1 extends Closeable {
   AudioFormat class_();

   ByteBuffer class_(int var1) throws IOException;
}
