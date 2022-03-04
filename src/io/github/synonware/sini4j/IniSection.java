/**
	MIT License
	
	Copyright (c) 2022 Synonware MEI.
	
	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:
	
	The above copyright notice and this permission notice shall be included in all
	copies or substantial portions of the Software.
	
	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
	SOFTWARE.
*/
package io.github.synonware.sini4j;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Gabriel (https://github.com/gbrlandrade)
 */
public class IniSection implements IIniSection
{
	
	private Map<String, Object> sectorValues = new LinkedHashMap<>();

	@Override
	public void add(String key, Object value) 
	{
		if(sectorValues.containsKey(key))
		{
			remove(key);
		}
		
		sectorValues.put(key, value);
	}

	@Override
	public void remove(String key) 
	{
		sectorValues.remove(key);
	}

	@Override
	public Object get(String key) 
	{
		return sectorValues.get(key);
	}

	@Override
	public String getString(String key) 
	{
		return (String) get(key);
	}

	@Override
	public boolean getBoolean(String key) 
	{
		return (boolean) get(key);
	}

	@Override
	public int getInt(String key) 
	{
		return (int) get(key);
	}

	@Override
	public float getFloat(String key) 
	{
		return (float) get(key);
	}

	@Override
	public double getDouble(String key) 
	{
		return (double) get(key);
	}

	@Override
	public long getLong(String key)
	{
		return (long) get(key);
	}	

	public Map<String, Object> getMap() 
	{
		return sectorValues;
	}
	
	@Override
	public String toString() 
	{
		return sectorValues.toString();
	}
	
}
