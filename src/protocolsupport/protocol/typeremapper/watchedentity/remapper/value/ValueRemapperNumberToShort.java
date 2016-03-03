package protocolsupport.protocol.typeremapper.watchedentity.remapper.value;

import protocolsupport.utils.datawatcher.DataWatcherObject;
import protocolsupport.utils.datawatcher.objects.DataWatcherObjectShort;

public class ValueRemapperNumberToShort implements ValueRemapper<DataWatcherObject<?>> {

	public static final ValueRemapperNumberToShort INSTANCE = new ValueRemapperNumberToShort();

	protected ValueRemapperNumberToShort() {
	}

	@Override
	public DataWatcherObject<?> remap(DataWatcherObject<?> object) {
		Number number = (Number) object.getValue();
		return new DataWatcherObjectShort(number.shortValue());
	}


}